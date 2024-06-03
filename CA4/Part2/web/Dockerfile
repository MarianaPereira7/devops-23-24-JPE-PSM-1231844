FROM openjdk:17-bullseye
LABEL authors="Mariana Pereira"

RUN mkdir /opt/web

WORKDIR /opt/web

RUN wget https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.24/bin/apache-tomcat-10.1.24.tar.gz && \
    tar xzvf apache-tomcat-10*tar.gz -C . && \
    chmod -R u+x apache-tomcat-10* && \
    rm apache-tomcat-10*tar.gz

RUN git clone https://github.com/MarianaPereira7/devops-23-24-JPE-PSM-1231844.git gitrepo && \
    mkdir react-and-spring-data-rest-basic && \
    cp -r gitrepo/CA2/Part2/react-and-spring-data-rest-basic/* react-and-spring-data-rest-basic/ && \
    chmod u+x react-and-spring-data-rest-basic/gradlew && \
    rm -r gitrepo

WORKDIR react-and-spring-data-rest-basic

RUN ./gradlew clean build

RUN cp ./build/libs/react-and-spring-data-rest-basic-0.0.1-SNAPSHOT.war /opt/web/apache-tomcat-10*/webapps/

WORKDIR /opt/web

EXPOSE 8080

CMD ./apache-tomcat-10*/bin/catalina.sh run