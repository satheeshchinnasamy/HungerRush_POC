Feature: Report Page feature
Background:
Given user already in Home page
|username|password|
|ReventinAdminTest@hungerrush.com|Test@123|


Scenario: Report page validation
Given user is in report page
Then Verify the page title is "HungerRush HUB | Reports"


Scenario: View the sales report
Given user is in report page
When User selects the Sales option in the list
And User selects the Daily performance-single store
And Enter the from and to date and click the view report
Then report should be displayed