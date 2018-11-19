def call(List<File> scripts, String workdir) {
    scripts.each {
        stage("Setup ${it.name}") {
            def loadScript = libraryResource it.path - workdir - "/workspace@libs/groovy-test/resources"
            writeFile file: it.name, text: loadScript
            return sh(script: "chmod +x ${it.name}", returnStdout: true)
        }
    }
}
