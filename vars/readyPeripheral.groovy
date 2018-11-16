def call(String[] services, project) {
    services.each {
        stage("Ready $it") {
            return sh(script: "./ready.sh $it $project", returnStdout: true)
        }
    }
}
