FROM ubuntu:latest

MAINTAINER Lyray

RUN apt-get update & apt-get install -y \
default-jre \
default-jdk \
maven

COPY pom.xml /xiuxiu/

COPY src/ /xiuxiu/src/

WORKDIR /xiuxiu/

RUN mvn package

EXPOSE  8080

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/xiuxiu-0.0.1-SNAPSHOT.jar"]