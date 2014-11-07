package pupa.ec

class UserAcceptance {
	static belongsTo = [userStory: UserStory]
	
	static hasMany = [userAcceptanceAppPages: UserAcceptanceAppPage]

    static constraints = {
    }
}
