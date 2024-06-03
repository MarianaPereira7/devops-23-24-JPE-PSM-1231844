FROM openjdk:17-bullseye
LABEL authors="Mariana Pereira"

RUN mkdir /opt/db

WORKDIR /opt/db

RUN wget https://repo1.maven.org/maven2/com/h2database/h2/1.4.200/h2-1.4.200.jar

# We want to access H2 console from the host using port 8082
EXPOSE 8082

# We want to connect to the H2 server using port 9092
EXPOSE 9092

CMD java -cp ./h2*.jar org.h2.tools.Server -web -webAllowOthers -tcp -tcpAllowOthers -ifNotExists > out.txt