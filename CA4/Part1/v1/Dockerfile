FROM openjdk:17-bullseye
LABEL authors="Mariana Pereira"

WORKDIR /opt

RUN mkdir gradle_basic_demo

RUN git clone https://github.com/MarianaPereira7/devops-23-24-JPE-PSM-1231844.git gitrepo

WORKDIR gitrepo/CA2/Part1/gradle_basic_demo

RUN chmod +x gradlew && ./gradlew build

RUN cp build/libs/basic_demo-0.1.0.jar /opt/gradle_basic_demo/

WORKDIR /opt/gradle_basic_demo

RUN rm -r /opt/gitrepo

EXPOSE 7777

ENTRYPOINT ["java", "-cp"]

CMD ["basic_demo-0.1.0.jar", "basic_demo.ChatServerApp", "7777"]