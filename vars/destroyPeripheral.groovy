def call(String[] services, project, templatesVersion) {
    return stage("Destroy $it") {
        return sh(script: "./destroy.sh $it $project $templatesVersion", returnStdout: true)
    }
}

