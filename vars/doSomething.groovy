def call(File[] scripts, workdir) {
    scripts.each {
        stage("Setup ${it.name}") {
            def loadScript = libraryResource it.path - workdir - "/workspace@libs/groovy-test/resources"
            writeFile file: it.name, text: loadScript
            println("Handling: ${it.name}")
            return sh(script: "chmod +x ${it.name}", returnStdout: true)
        }
    }
}
