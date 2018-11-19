import static groovy.io.FileType.FILES
def call() {

    String buildRootDir = pwd() - "/workspace"
    def dir = new File(buildRootDir + "/workspace@libs/groovy-test/resources/com/stefan/iit")

    List<File> scripts = new ArrayList<File>()

    //Get all files in directory "dir"
    dir.traverse(type: FILES, maxDepth: 0) { File script ->
        scripts.add(script)
    }

    doSomething(scripts, workDir)
}

