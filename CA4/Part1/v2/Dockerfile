FROM openjdk:21-bullseye
LABEL authors="Mariana Pereira"

WORKDIR /opt

RUN mkdir gradle_basic_demo

WORKDIR /opt/gradle_basic_demo

COPY CA2/Part1/gradle_basic_demo/build/libs/basic_demo-0.1.0.jar .

EXPOSE 51515

ENTRYPOINT ["java", "-cp"]

CMD ["basic_demo-0.1.0.jar", "basic_demo.ChatServerApp", "51515"]