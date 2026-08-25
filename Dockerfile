FROM eclipse-temurin:17
WORKDIR /lol/
COPY . .
RUN javac java3.java
CMD [ "java", "java3" ]
