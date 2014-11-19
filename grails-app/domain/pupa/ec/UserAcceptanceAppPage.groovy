package pupa.ec

class UserAcceptanceAppPage {
	static belongsTo = [userAcceptance: UserAcceptance, appPage: AppPage]

    static constraints = {
    }
}
