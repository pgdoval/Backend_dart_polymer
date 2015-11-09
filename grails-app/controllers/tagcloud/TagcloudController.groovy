package tagcloud

import grails.converters.JSON



class TagcloudController {

    def getPairs() { 
    
        def pairs = [
              [size:'normal-word', text:'Codemotion'],
              [size:'minor-word', text:'Organization'],
              [size:'normal-word', text:'Modularity'],
              [size:'big-word', text:'Dart'],
              [size:'big-word', text:'Polymer'],
              [size:'normal-word', text:'Clean code'],
              [size:'minor-word', text:'Javascript'],
              [size:'minor-word', text:'Separation of concerns'],
              [size:'minor-word', text:'Single responsability'],
              [size:'minor-word', text:'Component orientation']
            ]

        render pairs as JSON
    
    }
}
