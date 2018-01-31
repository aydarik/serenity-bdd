Lookup a translation
Narrative:
In order to translate a phrase that I don't know
As a user
I want to look up phrase translation

Scenario: Looking up the translation of 'horse'
Given the user is on the Google Translate page
When the user looks up the translation of the phrase 'horse'
Then he should see the translation 'лошадь'
