Feature: Google Search - Feeling Lucky

Scenario Outline: Feeling Lucky - Google Search

Given I am on the google homepage
When I enter search "<term>"
And I click on I am Feeling Lucky button
Then I land on the first result homepage

Examples: 
|term							|
|Quality Assurance|
|Software Testing |