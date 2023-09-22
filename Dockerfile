FROM openjdk:8

COPY target/infosys1.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "infosys1.jar"]