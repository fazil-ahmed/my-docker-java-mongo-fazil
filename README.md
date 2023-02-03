# my-docker-java-mongo-fazil
This repository contains the dockerized version of my java project using spring boot framework and mongoDB

I will be attaching the docker commands below and the steps to setup the architecture.

1. start docker daemon with docker desktop (windows)

2. docker pull mongo:3.6(mongo:version)

3. docker images -> verify images is pulled

4. docker run -d -p 27017:27017 --name ummahskitchendb mongo:3.6

in application
--------------
create docker file in root directory

go to root directory in cmd

5. docker image build -t ummahskitchen .

6. docker run -p 8080:8080 --name ummahskitchen --link ummahskitchendb:mongo -d ummahskitchen

logs check command
------------------
docker logs (conatiner name)

remove container
---------------
docker rm -f ummahskitchendb

After getting comfortable with Dockerfile we can start using the docker-compose file -> mentioned in the project root directory
