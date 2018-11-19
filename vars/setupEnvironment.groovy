import groovy.io.FileType

def call() {

    String workdir = pwd() - "/workspace"
    def dir = new File(workdir + "/workspace@libs/groovy-test/resources/com/stefan/iit")

    dir.eachFileRecurse (FileType.FILES) { File script ->
        def loadScript = libraryResource script.path - workdir - "/workspace@libs/groovy-test/resources"
        writeFile file: script.name, text: loadScript
        println("Handling: ${script.name}")
        sh "chmod +x ${script.name}"
    }
}
