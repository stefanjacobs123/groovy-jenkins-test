def call(String[] services, project, templatesVersion) {
    services.each {
        return sh(script: "./ready.sh $it $project $templatesVersion", returnStdout: true)
    }
}
