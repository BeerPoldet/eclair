import pupa.ec.UserStory

class BootStrap {

    def init = { servletContext ->
		new UserStory(userRole: "Dec", desire: "The Shining", motivation:"????", userAcceptances: []).save()
    }
    def destroy = {
    }
}
