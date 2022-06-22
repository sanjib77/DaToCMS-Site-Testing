
@tag
Feature: Title of your feature
  I want to use this template for my feature file

	Scenario:   verification of try for free button
		Given   you are on the homepage of Datocms
		When  user click on try it for free
		Then  user redirects to the registration page
		
	Scenario:   verification of login button
		Given    you are on the homepage of Datocms
		When  user click on login
		Then  user redirects to the login page
	
	Scenario:   verification of subscribe button
		Given    you are on the homepage of Datocms
		When  email field is empty
		Then  should give message please, enter your email.
	
	Scenario:   verification of the images 
		Given    you are on the homepage of Datocms
		When  user scroll downs the homepage 
		Then  images should be visible to user.
	
	Scenario:   verification of the read the story link
		Given    you are on the homepage of Datocms
		When  when user clicks on read the story link
		Then  user redirects to the story page he clicked
	
