package pupa.ec

import grails.rest.RestfulController
import static org.springframework.http.HttpStatus.*
import grails.converters.JSON

import org.springframework.http.HttpStatus

class UserStoryController extends RestfulController {

    static responseFormats = ['json', 'xml']

    UserStoryController() {
    	super(UserStory)
    }

    @Override
    def index(final Integer id) {
    	log.debug "ajsldfjldskjf"
    	if (!id)
    		render UserStory.list() as JSON

        render UserStory.get(id) as JSON
    }
	
}