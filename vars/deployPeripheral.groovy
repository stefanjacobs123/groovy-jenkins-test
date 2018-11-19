def call(String[] services, project, templatesVersion) {
    services.each {
        return sh(script: "./deploy.sh $it $project $templatesVersion", returnStdout: true)
    }
}
