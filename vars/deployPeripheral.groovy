def call(String[] services, project, templatesVersion) {
    services.each {
        sh(script: "./deploy.sh $it $project $templatesVersion")
    }
}
