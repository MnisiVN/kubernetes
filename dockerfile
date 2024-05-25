FROM bellsoft/liberica-runtime-container:jre-17-stream-musl
COPY target/kubernetes-0.0.1-SNAPSHOT.jar kubernetes.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/kubernetes.jar"]