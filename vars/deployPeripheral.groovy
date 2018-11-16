def call(String[] services, project) {
    services.each {
        return sh(script: "echo deploying $it in $project", returnStdout: true)
    }
}
