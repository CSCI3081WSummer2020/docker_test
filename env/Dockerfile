FROM  openjdk:8-jdk-alpine3.9

RUN apk update
RUN apk add git
RUN apk add wget
RUN apk add unzip
RUN apk add vim

RUN wget -q https://services.gradle.org/distributions/gradle-6.5.1-bin.zip \
    && unzip gradle-6.5.1-bin.zip -d /opt \
    && rm gradle-6.5.1-bin.zip

ENV GRADLE_HOME /opt/gradle-6.5.1
ENV PATH $PATH:/opt/gradle-6.5.1/bin

RUN mkdir -p /csci3081w
VOLUME /csci3081w
WORKDIR /csci3081w