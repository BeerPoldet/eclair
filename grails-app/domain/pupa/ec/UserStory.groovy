package pupa.ec

class UserStory {
	String userRole
	String desiration
	String motivation
	
	static hasMany = [userAcceptances: UserAcceptance]
	
    static constraints = {
    }
	
	static mapping = {
		
 }
}
