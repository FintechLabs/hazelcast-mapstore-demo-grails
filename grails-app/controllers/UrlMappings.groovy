class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "personDomain")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
