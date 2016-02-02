#!/bin/bash
ssh -i /home/tomcat/.aws/firstKeys.pem bitnami@52.90.97.139 "sudo su root -c /bin/bash" < stopTC.sh
echo "copying new website"
scp -i /home/tomcat/.aws/firstKeys.pem /opt/bitnami/apps/jenkins/jenkins_home/jobs/farPoint/workspace/target/FarPoint-1.war bitnami@52.90.97.139:/home/bitnami
echo "done"
echo "starting tomcat"
ssh -i /home/tomcat/.aws/firstKeys.pem bitnami@52.90.97.139 "sudo su root -c /bin/bash" < startTC.sh
echo "Deployment done"
