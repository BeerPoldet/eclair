package pupa.ec

class AppPage {
	byte[] image
	
	static hasMany = [userAcceptanceAppPages: UserAcceptanceAppPage]
	

    static constraints = {
    }
}
