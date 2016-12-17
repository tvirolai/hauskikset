FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/hauskikset.jar /hauskikset/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/hauskikset/app.jar"]
