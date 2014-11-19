package pupa.ec

import static org.springframework.http.HttpStatus.*
import grails.converters.JSON

import org.springframework.http.HttpStatus
class UserStoryController {

	def index() {
		if (request.method == 'GET') {
			render(UserStory.list() as JSON)
		} else if (request.method == 'POST') {
			log.debug params
			def userStoryInstance = new UserStory(userRole : params.userRole, desire: params.desire, motivation: params.motivation, userAcceptances: params.userAcceptances);

			try{
				userStoryInstance.save(failOnError: true)
				responseWithFormat(request, OK)
			}catch(Exception e){
				//		            form multipartForm {
				//		                flash.message = message(code: 'default.deleted.message', args: [message(code: 'UserAcceptance.label', default: 'UserAcceptance'), userAcceptanceInstance.id])
				//		                redirect action:"index", method:"GET"
				//		            }
				log.error e.message
				responseWithFormat(request, BAD_REQUEST)
			}

		}

	}

	private responseWithFormat (request, status){
		request.withFormat {
			'*'{ render status: status }
		}

	}
}