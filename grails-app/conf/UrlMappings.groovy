class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/userStory"(resources:"userStory")
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
