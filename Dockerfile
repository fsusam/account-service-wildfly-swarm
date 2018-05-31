FROM jboss/base-jdk:8
MAINTAINER markus@jboss.org
EXPOSE 8080
COPY target/account-service-wildfly-swarm.jar /opt/wildfly-swarm/
USER root
RUN ["chown", "-R", "jboss:jboss","/opt/wildfly-swarm/"]

USER jboss

ENTRYPOINT ["java","-Djava.net.preferIPv4Stack=true","-Djava.net.preferIPv4Addresses=true","-jar","/opt/wildfly-swarm/account-service-wildfly-swarm.jar"]

#ENTRYPOINT ["java","-Djava.net.preferIPv4Stack=true","-Djava.net.preferIPv4Addresses=true","-jar","-Dswarm.logging.category.name=DEBUG","/opt/wildfly-swarm/account-service-wildfly-swarm.jar"]
