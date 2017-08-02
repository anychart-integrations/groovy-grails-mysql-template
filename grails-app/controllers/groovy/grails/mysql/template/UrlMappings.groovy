package groovy.grails.mysql.template

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        // "/"(view:"/index")
        "/"(controller: "chart")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
