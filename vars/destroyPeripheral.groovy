def call(String[] services, project, templatesVersion) {
    def destroyPeripheral = [failFast: true]
    services.each {
        destroyPeripheral["Destroy $it"] = {
            stage("Destroy $it") {
                return sh(script: "./destroy.sh $it $project $templatesVersion", returnStdout: true)
            }
        }
    }
}

