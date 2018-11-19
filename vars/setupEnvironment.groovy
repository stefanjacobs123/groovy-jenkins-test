import static groovy.io.FileType.FILES
@NonCPS
def call() {

    String workdir = pwd() - "/workspace"
    def dir = new File(workdir + "/workspace@libs/groovy-test/resources/com/stefan/iit")

    def scripts = []

    dir.traverse(type: FILES, maxDepth: 0) { script ->
        scripts.add(script)
    }
//
//    for(int i = 0; i < scripts.size(); i++) {
//        def loadScript = libraryResource scripts[i].path - workdir - "/workspace@libs/groovy-test/resources"
//        writeFile file: scripts[i].name, text: loadScript
//        sh(script: "chmod +x ${scripts[i].name}", returnStdout: true)
//    }

//    scripts.forEach {
//        println("%%%" + it)
//        def loadScript = libraryResource it.path - workdir - "/workspace@libs/groovy-test/resources"
//        writeFile file: it.name, text: loadScript
//        println("Handling: ${it.name}")
//        return sh(script: "chmod +x ${it.name}", returnStdout: true)
//    }

    scripts.each {
        stage("Copy $it") {
            File script = it
            def loadScript = libraryResource script.path - workdir - "/workspace@libs/groovy-test/resources"
            writeFile file: script.name, text: loadScript
            println("Handling: ${script.name}")
            return sh(script: "chmod +x ${it.name}", returnStdout: true)
        }
    }
}

