def call(String[] services, project, templatesVersion) {
    services.each {
        stage("Destroy $it") {
            return sh(script: "./destroy.sh $it $project $templatesVersion", returnStdout: true)
        }
    }
}
