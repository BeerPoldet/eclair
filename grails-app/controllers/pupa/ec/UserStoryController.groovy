package pupa.ec

import static org.springframework.http.HttpStatus.*
import grails.converters.JSON

import org.springframework.http.HttpStatus
class UserStoryController {

	def index() {
		if (request.method == 'GET') {
			render(UserStory.list() as JSON)
		} else if (request.method == 'POST') {
			UserStory userStoryInstance = params.id ? updateUserAcceptance(params) : createUserAcceptance(params)

			try{
				userStoryInstance.validate()
				userStoryInstance.save()
				responseWithFormat(request, OK)
			}catch(Exception e){
				log.error e.message
				log.error userStoryInstance.errors
//				e.printStackTrace()
				responseWithFormat(request, BAD_REQUEST)
			}

		}

	}
	
	private updateUserAcceptance(params) {
		log.debug params
		def userStoryInstance = UserStory.get(params.id as Long)
		userStoryInstance.properties = params
		userStoryInstance
	}
	
	private createUserAcceptance(params) {
		def userAcceptanceList = JSON.parse(params.userAcceptances) as List
		def userAcceptanceInstanceList = userAcceptanceList.collect { userAcceptance ->
			new UserAcceptance(details: userAcceptance.details)
		}
		
		def userStoryInstance = new UserStory(userRole : params.userRole, desire: params.desire, motivation: params.motivation, userAcceptances: userAcceptanceInstanceList)
		userStoryInstance
	}

	private responseWithFormat (request, status){
		request.withFormat {
			'*'{ render status: status }
		}

	}
}