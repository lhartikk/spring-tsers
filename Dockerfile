FROM java:8
WORKDIR /spring-tsers
ADD ./build/libs/spring-tsers.jar /spring-tsers/spring-tsers.jar
CMD java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,suspend=n -jar spring-tsers.jar