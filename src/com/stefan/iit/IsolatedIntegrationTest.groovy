package com.stefan.iit

class Utilities {
    static def deployPeripheral(script, args) {
        script.sh "echo Deploying ${args}"
    }
}