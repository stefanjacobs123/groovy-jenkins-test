def call(String[] services) {
    services.each {
        return sh(script: "echo deploying $SERVICE in $PROJECT", returnStdout: true)
    }
}
