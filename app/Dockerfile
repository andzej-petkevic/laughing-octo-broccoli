FROM amazoncorretto:22-alpine AS build
WORKDIR /usr/build-dir
ADD . /usr/build-dir
RUN ./mvnw -f /usr/build-dir/pom.xml clean package

FROM amazoncorretto:22-alpine
COPY --from=build /usr/build-dir/target/*.jar /app.jar

ENV TZ=Europe/Vilnius
ENV LISTEN_PORT=""
ENV CONTEXT_PATH=""
ENV JAVA_OPTS=""

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

CMD java -Djava.security.egd=file:/dev/./urandom \
        ${JAVA_OPTS} \
        -jar /app.jar \
        --server.port=${LISTEN_PORT:-8080}
