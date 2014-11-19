package pupa.ec
import grails.rest.*


class UserStory {
	String userRole
	String desire
	String motivation
	
	static hasMany = [userAcceptances: UserAcceptance]
	
    static constraints = {
    }
	
}
