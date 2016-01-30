#!/bin/bash
ssh -i ../firstKeys.pem bitnami@54.172.88.237 "sudo su root -c /bin/bash" < stopTC.sh
