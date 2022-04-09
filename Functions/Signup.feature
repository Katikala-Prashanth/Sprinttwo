Feature: Signup

@Test1
Scenario: Successful Signup with username and password
	Given User Launch Chrome browser 
	When User opens URL "https://www.demoblaze.com/" 
	And User enters Email as "sprinttwo@gmail.com" and Password as "sprinttwo@123" 
	And Click on Signup
	Then verify alert message as "Sign up successful."
	And close browser 
	
	
	
	@Test2
Scenario: Successful Signup with valid username and password
	Given User Launch Chrome browser 
	When User opens URL "https://www.demoblaze.com/" 
	And User enters Email as "ramesh1234" and Password as "p@123" 
	And Click on Signup 
	Then verify alert message as "This user already exist."
	And close browser 
	
	#Test1 for +ve
	#test2 for -ve