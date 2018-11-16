def call(String[] services, project) {
    services.each {
        stage("Deploy $it") {
            return sh(script: "echo deploying $it in $project", returnStdout: true)
        }
    }
}
