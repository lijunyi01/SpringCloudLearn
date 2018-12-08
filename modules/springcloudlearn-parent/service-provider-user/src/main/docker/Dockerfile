FROM java:8
VOLUME /tmp
ADD service-provider-user-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'

#环境变量 设置上海时区
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

#开放9061/9062端口
EXPOSE 9061 9062

#配置容器启动后执行的命令
ENTRYPOINT ["java","-Djava.security.edg=file:/dev/./urandom","-jar","/app.jar"]