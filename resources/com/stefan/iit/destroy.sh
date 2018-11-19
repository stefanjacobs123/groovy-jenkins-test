#!/bin/bash
SERVICE=$1
PROJECT=$2
TEMPLATES_VERSION=$3

case "$SERVICE" in
        "kafka"      ) echo "destroy $SERVICE in $PROJECT with template release and tagged $TEMPLATES_VERSION";;
        "cassandra"  ) echo "destroy $SERVICE in $PROJECT with template release and tagged $TEMPLATES_VERSION";;
esac
