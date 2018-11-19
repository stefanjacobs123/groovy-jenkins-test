import groovy.io.FileType

def call() {

    def dir = new File("./resources/com/stefan/iit")

    dir.eachFileRecurse (FileType.FILES) { File script ->
        def loadScript = libraryResource script.path - "resources/"
        writeFile file: script.name, text: loadScript
        sh "chmod +x ${script.name}"
    }
}
