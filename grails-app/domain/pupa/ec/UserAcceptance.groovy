package pupa.ec

class UserAcceptance {
	static belongsTo = [userStory: UserStory]
	String details
	static hasMany = [appPages: AppPage]

    static constraints = {
    }
}
