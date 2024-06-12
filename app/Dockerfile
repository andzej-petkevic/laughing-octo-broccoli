FROM amazoncorretto:22-alpine
ADD target/*.jar /app.jar

ENV TZ=Europe/Vilnius
ENV LISTEN_PORT=""
ENV CONTEXT_PATH=""
ENV JAVA_OPTS=""

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

CMD java -Djava.security.egd=file:/dev/./urandom \
        ${JAVA_OPTS} \
        -jar /app.jar \
        --server.port=${LISTEN_PORT:-8080}
