#!/bin/bash
SERVICE=$1
PROJECT=$2
TEMPLATES_VERSION=$3

case "$SERVICE" in
        "Orange" ) echo "destroy $SERVICE in $PROJECT with template release and tagged $TEMPLATES_VERSION";;
        "Banana" ) echo "destroy $SERVICE in $PROJECT with template release and tagged $TEMPLATES_VERSION";;
esac
