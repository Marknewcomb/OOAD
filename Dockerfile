FROM alpine

RUN apk add openjdk17

RUN apk add maven

COPY . /app

WORKDIR app

RUN mvn clean install

CMD java -cp target/OOAD-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.newcomb.java.Main
