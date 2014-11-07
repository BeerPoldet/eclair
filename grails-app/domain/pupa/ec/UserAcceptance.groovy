package pupa.ec

class UserAcceptance {
	static belongsTo = [userStory: UserStory]
	String details
	static hasMany = [userAcceptanceAppPages: UserAcceptanceAppPage]

    static constraints = {
    }
}
