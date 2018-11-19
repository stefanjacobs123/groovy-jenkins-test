def call(String[] services, project, templatesVersion) {
    services.each {
        return sh(script: "./destroy.sh $it $project $templatesVersion", returnStdout: true)
    }
}
