
def call(File script) {
    String workdir = pwd() - "/workspace"
    def loadScript = libraryResource script.path - workdir - "/workspace@libs/groovy-test/resources"
    writeFile file: script.name, text: loadScript
    println("Handling: ${script.name}")
    return sh(script: "chmod +x ${it.name}", returnStdout: true)
}