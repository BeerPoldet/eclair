package pupa.ec

class AppPage {
	byte[] image
	
	static hasMany = [userAcceptances: UserAcceptance]
	
	UserAcceptance owner
	static belongsTo = [UserAcceptance]

    static constraints = {
    }
}
