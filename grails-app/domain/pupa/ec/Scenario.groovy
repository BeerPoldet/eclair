package pupa.ec

class Scenario {
	String title
	String description
	
	static hasMany = [sequences: Sequence]
	
    static constraints = {
    }
}
