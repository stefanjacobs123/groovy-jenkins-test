def call(String[] services, project) {
    services.each {
        stage {
            return sh(script: "echo deploying $it in $project", returnStdout: true)
        }
    }
}
