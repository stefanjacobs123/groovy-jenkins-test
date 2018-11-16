def call(String[] services, project) {
    services.each {
        stage("Deploy $it") {
            return sh(script: "./deploy.sh $it $project", returnStdout: true)
        }
    }
}
