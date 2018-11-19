def call(String[] services, project, templatesVersion) {
    services.each {
        stage("Ready $it") {
            return sh(script: "./ready.sh $it $project $templatesVersion", returnStdout: true)
        }
    }
}
