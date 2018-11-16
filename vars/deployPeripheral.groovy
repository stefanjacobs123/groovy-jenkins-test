def call(String[] services, project) {
    services.each {
        deployPeripheral["Deploy $it"] = {
            stage("Deploy $it") {
                return sh(script: "echo deploying $it in $project", returnStdout: true)
            }
        }
    }
}
