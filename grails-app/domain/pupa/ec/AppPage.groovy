package pupa.ec

class AppPage {
	byte[] image
	
	static hasMany = [userAcceptances: UserAcceptance]

    static constraints = {
    }
}
