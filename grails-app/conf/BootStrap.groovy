import grails.util.Environment
class BootStrap {
def fixtureLoader

    def init = { servletContext ->
		
		Environment.executeForCurrentEnvironment {
			development {
				fixtureLoader.load('dev')
			}
		}
    }
    def destroy = {
    }
}
