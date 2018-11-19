import static groovy.io.FileType.FILES
@NonCPS
def call() {

    String workdir = pwd() - "/workspace"
    def dir = new File(workdir + "/workspace@libs/groovy-test/resources/com/stefan/iit")

//    def scripts = []

    dir.traverse(type: FILES, maxDepth: 0) { script ->
        def loadScript = libraryResource script.path - workdir - "/workspace@libs/groovy-test/resources"
        writeFile file: script.name, text: loadScript
        println("Handling: ${script.name}")
        return sh(script: "chmod +x ${script.name}", returnStdout: true)
    }

//    for(int i = 0; i < scripts.size(); i++) {
////        println("I'm here")
//        def loadScript = libraryResource scripts[i].path - workdir - "/workspace@libs/groovy-test/resources"
//        writeFile file: scripts[i].name, text: loadScript
//        println("Handling: ${scripts[i].name}")
//        return sh(script: "chmod +x ${scripts[i].name}", returnStdout: true)
//    }

//    scripts.forEach {
//        println("%%%" + it)
//        def loadScript = libraryResource it.path - workdir - "/workspace@libs/groovy-test/resources"
//        writeFile file: it.name, text: loadScript
//        println("Handling: ${it.name}")
//        return sh(script: "chmod +x ${it.name}", returnStdout: true)
//    }

//    scripts.each {
//        File file = it
//        def loadScript = libraryResource file.path - workdir - "/workspace@libs/groovy-test/resources"
//        writeFile file: file.name, text: loadScript
//        println("Handling: ${file.name}")
//        sh "chmod +x ${file.name}"
//    }
}

