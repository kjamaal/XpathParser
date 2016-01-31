#!/bin/bash
echo "stopping tomcat"
sudo su root -c '/bin/bash /opt/bitnami/apache-tomcat/bin/shutdown.sh'
echo "removing old web site"
rm -R /opt/bitnami/apache-tomcat/webapps/FarPoint-1 /opt/bitnami/apache-tomcat/webapps/FarPoint-1.war
echo "done"
