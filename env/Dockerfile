FROM  ubuntu:16.04

RUN apt-get update && apt-get install -y \
	git \
	openjdk-8-jdk \
	doxygen \
	graphviz \
	wget \
	unzip \
	vim

ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64

RUN wget -q https://services.gradle.org/distributions/gradle-6.5.1-bin.zip \
    && unzip gradle-6.5.1-bin.zip -d /opt \
    && rm gradle-6.5.1-bin.zip

ENV GRADLE_HOME /opt/gradle-6.5.1
ENV PATH $PATH:/opt/gradle-6.5.1/bin

RUN mkdir -p /csci3081w
VOLUME /csci3081w
WORKDIR /csci3081w
