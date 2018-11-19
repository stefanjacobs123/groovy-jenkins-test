def call(String[] services, project, templatesVersion) {
    services.each {
        sh(script: "./destroy.sh $it $project $templatesVersion")
    }
}
