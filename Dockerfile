From tomcat:8.0.51-jre8-alpine

COPY target/ummahskitchen-docker-app.war /usr/local/tomcat/webapps/


CMD ["catalina.sh","run"]