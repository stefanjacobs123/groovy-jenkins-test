#!/bin/bash
SERVICE=$1
PROJECT=$2

case "$SERVICE" in
        "kafka"      ) echo "$SERVICE in $PROJECT";;
        "cassandra"  ) echo "$SERVICE in $PROJECT";;
esac