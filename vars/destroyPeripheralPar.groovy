def call(String[] services, project, templatesVersion) {
    def map = [:]
    services.each {
        emptyMap.put("Destroy " + it, { sh(script: "./destroy.sh $it $project $templatesVersion") } )
    }
    parallel(map)
}
