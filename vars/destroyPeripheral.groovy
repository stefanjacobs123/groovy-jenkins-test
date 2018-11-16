def call(String[] services, project) {
    services.each {
        stage("Destroy $it") {
            return sh(script: "./destroy.sh $it $project", returnStdout: true)
        }
    }
}
