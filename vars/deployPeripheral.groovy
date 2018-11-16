def call(String[] services) {
    services.each {
        return sh(script: "resources/iit/deploy.sh $services", returnStdout: true)
    }
}
