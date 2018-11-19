def call(String[] services, project, templatesVersion) {
    services.each {
        sh(script: "./ready.sh $it $project $templatesVersion")
    }
}
