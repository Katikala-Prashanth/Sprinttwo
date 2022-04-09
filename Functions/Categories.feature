Feature: Categories

@Test1
Scenario: To validate phone list are displayed in window

	Given User Launch Chrome browser 
	When User opens URL "https://www.demoblaze.com/" 
	And Click on product list from categories 
	Then Verify the product displayed in the list "Iphone 6 32gb"
	And close browser 
	
	