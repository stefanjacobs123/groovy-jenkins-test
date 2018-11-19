def call(String[] services, project, templatesVersion) {
    services.each {
        stage("Deploy $it") {
            return sh(script: "./deploy.sh $it $project $templatesVersion", returnStdout: true)
        }
    }
}
