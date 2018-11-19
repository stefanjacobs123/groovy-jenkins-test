import groovy.io.FileType

def call() {

    String workdir = pwd() - "/workspace"
    def dir = new File(workdir + "/workspace@libs/groovy-test/resources/com/stefan/iit")

    def scripts = File[]

    dir.eachFileRecurse (FileType.FILES) { File script ->
        scripts << script
    }

    scripts.each {
        println(it)
    }

    scripts.each {
        File file = it
        def loadScript = libraryResource file.path - workdir - "/workspace@libs/groovy-test/resources"
        writeFile file: file.name, text: loadScript
        println("Handling: ${file.name}")
        sh "chmod +x ${file.name}"
    }
}

