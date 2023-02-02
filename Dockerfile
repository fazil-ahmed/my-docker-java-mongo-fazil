FROM tomcat:8.0.51-jre8-alpine AS build
MAINTAINER Fazil Ahmed Hakeem (fazil1997ahmed@gmail.com)

# Install Java.
RUN apk --update --no-cache add openjdk8 curl
RUN apk add maven

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/default-jvm/

COPY src /usr/local/service/src
COPY pom.xml /usr/local/service
RUN mvn -f /usr/local/service/pom.xml clean install -DskipTests


FROM tomcat:8.0.51-jre8-alpine
COPY --from=build /usr/local/service/target/ummahskitchen-docker-app.war /usr/local/tomcat/webapps
WORKDIR /usr/local/tomcat/webapps/

CMD ["catalina.sh","run"]