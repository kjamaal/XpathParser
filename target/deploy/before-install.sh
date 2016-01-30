#!/bin/bash
ssh -i ../firstKeys.pem bitnami@54.172.88.237 "sudo su -c
/bin/bash /opt/bitnami/apache-tomcat/bin/shutdown.sh"
#rm -R /opt/bitnami/apache-tomcat/webapps/FarPoint-0.0.1-SNAPSHOT /opt/bitnami/apache-tomcat/webapps/FarPoint-0.0.1-SNAPSHOT.war