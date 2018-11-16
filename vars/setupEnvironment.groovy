def call() {
    def deploy  = libraryResource 'com/stefan/iit/deploy.sh'
    def ready   = libraryResource 'com/stefan/iit/ready.sh'
    def destroy = libraryResource 'com/stefan/iit/destroy.sh'

    writeFile file: 'deploy.sh',  text: deploy
    writeFile file: 'ready.sh',   text: ready
    writeFile file: 'destroy.sh', text: destroy

    sh "chmod +x deploy.sh"
    sh "chmod +x ready.sh"
    sh "chmod +x destroy.sh"

}
