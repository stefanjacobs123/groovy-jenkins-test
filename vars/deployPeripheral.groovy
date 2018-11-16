def call(String[] services, project) {
    def deploy = libraryResource 'com/stefan/iit/deploy.sh'
    writeFile file: 'deploy.sh', text: deploy
    sh "chmod +x deploy.sh"
    services.each {
        stage("Deploy $it") {
            return sh(script: "./deploy.sh kafka project", returnStdout: true)
        }
    }
}
