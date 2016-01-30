#!/bin/bash
echo "stopping tomcat"
sudo su root -c '/bin/bash /opt/bitnami/apache-tomcat/bin/shutdown.sh'
rm -R /opt/bitnami/apache-tomcat/webapps/FarPoint-0.0.1-SNAPSHOT /opt/bitnami/apache-tomcat/webapps/FarPoint-0.0.1-SNAPSHOT.war
echo "done"
