Feature: Login

@Test1
Scenario: Successful Login with valid username and password
	Given User Launch Chrome browser 
	When User opens URL "https://www.demoblaze.com/" 
	And User enters login Email as "Jasimno1@gmail.com" and Password as "Jasim" 
	And Click on Login
	Then Page tittle should be "STORE"
	And close browser 
	
	
	
	@Test2
Scenario: Successful Login with invalid username and password
	Given User Launch Chrome browser 
	When User opens URL "https://www.demoblaze.com/" 
	And User enters login Email as "pappu@gmail.com" and Password as "pappuhandsome@123" 
	And Click on Login
	Then Get alert message as "User does not exist."
	And close browser 