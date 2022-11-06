Feature: Login functionality

  Background: land to Home page
    Given go to login page

    @smoke
    Scenario: Login with valid credentials
      Given Enter "Team1" in userName or Email input field
      And Enter "TheATeam1@" in password input field
      When user click on login button
      Then user should successfully logged in
      When Click "add user button
      Then user should see "Home / Users / Add user" title
      And in field First name white first name
      And in field Last name write last name
      And in field User name wrire user name
      And in field Email address write
      And in field Password write password
      And in field Bio write short description
      And in field Time Zone choose time zone
      When click add user button
      Then verify user is created with correct parameteres



