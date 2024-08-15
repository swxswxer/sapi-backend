# Docker 镜像构建
FROM openjdk:11-jre-slim


COPY ./target/sapi-backend-0.0.1-SNAPSHOT.jar /tmp/sapi-backend-0.0.1-SNAPSHOT.jar

# 暴露端口
EXPOSE 7529

# 指定容器启动时运行的指令
ENTRYPOINT ["java", "-jar", "/tmp/sapi-backend-0.0.1-SNAPSHOT.jar"]
