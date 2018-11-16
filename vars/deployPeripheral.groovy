def call(String[] services, project) {
    def deploy = libraryResource 'com/stefan/iit/deploy.sh'
    writeFile file: 'deploy.sh', text: deploy
    services.each {
        stage("Deploy $it") {
            return sh(script: "source deploy.sh kafka", returnStdout: true)
        }
    }
}
