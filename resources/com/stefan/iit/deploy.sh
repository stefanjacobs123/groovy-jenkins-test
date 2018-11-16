#!/bin/bash
SERVICE=$1
PROJECT=$2

case "$SERVICE" in
        "kafka"      ) echo "deploy $SERVICE in $PROJECT";;
        "cassandra"  ) echo "deploy $SERVICE in $PROJECT";;
esac
