def call(String[] services, project) {
    services.each {
        destroyPeripheral["Destroy $it"] = {
            stage("Destroy $it") {
                return sh(script: "./destroy.sh $it $project", returnStdout: true)
            }
        }
    }
}
