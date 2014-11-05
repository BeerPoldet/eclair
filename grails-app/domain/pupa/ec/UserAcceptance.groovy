package pupa.ec

class UserAcceptance {
	static belongsTo = [userStory: UserStory]
	
	static hasMany = [appPages: AppPage]

    static constraints = {
    }
}
