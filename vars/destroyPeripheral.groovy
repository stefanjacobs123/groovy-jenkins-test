def call(String[] services, project) {
    services.each {
        this["Destroy $it"] = {
            stage("Destroy $it") {
                return sh(script: "./destroy.sh $it $project", returnStdout: true)
            }
        }
    }
}
