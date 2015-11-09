class UrlMappings {

    static mappings = {
        name pairs: "/pairs"  { controller = 'tagcloud' ; action = [ GET : 'getPairs' ] }
        
		"500"(view:'/error')
    }
}
