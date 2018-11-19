def call(List<File> scripts, String workDir) {
    scripts.each {
        def loadScript = libraryResource it.path - workDir - "/workspace@libs/groovy-test/resources"
        writeFile file: it.name, text: loadScript
        sh(script: "chmod +x ${it.name}")
    }
}
