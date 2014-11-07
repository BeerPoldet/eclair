package pupa.ec

class UserStory {
	String userRole
	String desire
	String motivation
	
	static hasMany = [userAcceptances: UserAcceptance]
	
    static constraints = {
    }
	
}
