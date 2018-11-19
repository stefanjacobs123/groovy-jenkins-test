import static groovy.io.FileType.FILES

def call() {

    String workdir = pwd() - "/workspace"
    def dir = new File(workdir + "/workspace@libs/groovy-test/resources/com/stefan/iit")

    def scripts = []

    dir.traverse(type: FILES, maxDepth: 0) { script ->
        scripts.add(script)
    }

    def countFilesAndDirs = 0
    dir.traverse {
        countFilesAndDirs++
    }

    println("&&&" + countFilesAndDirs)

    scripts.each {
        println("@@@" + it)
    }

    scripts.each {
        File file = it
        def loadScript = libraryResource file.path - workdir - "/workspace@libs/groovy-test/resources"
        writeFile file: file.name, text: loadScript
        println("Handling: ${file.name}")
        sh "chmod +x ${file.name}"
    }
}

