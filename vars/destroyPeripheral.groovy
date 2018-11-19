def call(String[] services, project, templatesVersion) {
    services.each {
        destroyPeripheral["Destroy $it"] = {
            stage("Destroy $it") {
                return sh(script: "./destroy.sh $it $project $templatesVersion", returnStdout: true)
            }
        }
    }
}
