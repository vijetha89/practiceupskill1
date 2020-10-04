Feature: Email Features
This includes below scenarios that would validate the following features
1.Registration with different user
2.Composing email
3.Logout 

Scenario Outline: Sending email to Naveen
When i tapped on Sign up!
And i entered First name as "<Fname>"
And i entered Last name as "<Lname>"
And i entered e-mail "<email>"
And i entered username "<username>"
And i entered  Pass "<Pass>" 
And i entered  Confirm Pass "<CPass>" 
And i tapped on Register
And i tapped on Compose Email
And i entered SendTo 
And i entered Subject
And i entered Body of email 
And i tapped on Send button
Then i should see success message "The message has been sent to naveen1 naveen1 (naveen1)" 


Examples:
|Fname	|Lname	|email					|username	|Pass						|CPass	|				
|43test	|43test	|43test@test.com|43test		|12345678912345	|12345678912345	|
|44test	|44test	|44test@test.com|44test		|12345678912345	|12345678912345	|


