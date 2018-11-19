import static groovy.io.FileType.FILES
@NonCPS
def call() {

    String workdir = pwd() - "/workspace"
    def dir = new File(workdir + "/workspace@libs/groovy-test/resources/com/stefan/iit")

    def scripts = []

    dir.traverse(type: FILES, maxDepth: 0) { script ->
        scripts.add(script)
    }

    doSomething(scripts, workdir)
}

