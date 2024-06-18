FROM  jenkins/jenkins:lts-alpine-jdk17

USER root

RUN apk add --update docker sudo nodejs npm

RUN echo "jenkins    ALL=NOPASSWD: ALL" > /etc/sudoers.d/jenkins

USER jenkins

EXPOSE 8080
