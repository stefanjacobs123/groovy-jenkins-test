def call(services) {
    return sh(script: "echo Deploying ${services}", returnStdout: true)
}
