#!/bin/bash
SERVICE=$1
PROJECT=$2

case "$SERVICE" in
        "kafka"      ) echo "ready $SERVICE in $PROJECT";;
        "cassandra"  ) echo "ready $SERVICE in $PROJECT";;
esac
