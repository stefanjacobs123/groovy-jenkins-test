import static groovy.io.FileType.FILES
def call() {

    String workdir = pwd() - "/workspace"
    def dir = new File(workdir + "/workspace@libs/groovy-test/resources/com/stefan/iit")

    List<File> scripts = new ArrayList<File>()

    dir.traverse(type: FILES, maxDepth: 0) { File script ->
        scripts.add(script)
    }

    doSomething(scripts, workdir)
}

