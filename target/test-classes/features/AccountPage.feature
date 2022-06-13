
@AccountPage
Feature: Account Page

Background: 
Given user is already logged in to the application
|username||password|
|demologin@gmail.com||12345@|
 
   Scenario: Account Page validation
    When user gets the title of the page
    Then page title should be "My account - My Store"
    Then user gets account section
      | ORDER HISTORY AND DETAILS |
      | MY CREDIT SLIPS           |
      | MY ADDRESSES              |
      | MY PERSONAL INFORMATION   |
      | MY WISHLISTS              |
      | Home                      |
   Then the user validted that the section count is 6
    

  