import pupa.ec.*
fixture {
	
	us01(UserStory, userRole: 'developer',desire: 'Something one',motivation: 'Exit one')
	us02(UserStory, userRole: 'project owner',desire: 'Something two',motivation: 'Exit two')
	us03(UserStory, userRole: 'project owner',desire: 'Something three',motivation: 'Exit three')
	us04(UserStory, userRole: 'project owner',desire: 'Something four',motivation: 'Exit four')
	
	usAcp01(UserAcceptance, userStory : us01, details: 'Have Page 1 to reslove Something 1.')
	usAcp02(UserAcceptance, userStory : us02, details: 'Have Page 2 to reslove Something 2.')
	usAcp03(UserAcceptance, userStory : us03, details: 'Have Page 3 to reslove Something 3.')
	
	
}