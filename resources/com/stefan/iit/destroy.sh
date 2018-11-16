#!/bin/bash
SERVICE=$1
PROJECT=$2

case "$SERVICE" in
        "kafka"      ) echo "destroy $SERVICE in $PROJECT";;
        "cassandra"  ) echo "destroy $SERVICE in $PROJECT";;
esac
