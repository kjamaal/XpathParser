#!/bin/bash
echo "copying on target"
sudo su root -c 'cp /home/bitnami/FarPoint-1.war /opt/bitnami/apache-tomcat/webapps'
echo "starting tomcat"
sudo su root -c '/bin/bash /opt/bitnami/apache-tomcat/bin/startup.sh'
echo "done"
