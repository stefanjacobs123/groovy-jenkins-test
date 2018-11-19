def call(String[] services, project, templatesVersion) {
    def emptyMap = [:]
    services.each {
        emptyMap.put(it, { sh(script: "./destroy.sh $it $project $templatesVersion", returnStdout: true) } )
    }
    return emptyMap
}
