package ru.gumerbaev.test.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import ru.gumerbaev.test.steps.serenity.EndUserSteps;

@SuppressWarnings("unused")
public class TranslationSteps {

    @Steps
    private EndUserSteps endUser;

    @Given("the user is on the Google Translate page")
    public void givenTheUserIsOnTheGoogleTranslatePage() {
        endUser.openThePage();
    }

    @When("the user looks up the translation of the phrase '$phrase'")
    public void whenTheUserLooksUpTheTranslationOf(String phrase) {
        endUser.looksFor(phrase);
    }

    @Then("he should see the translation '$translation'")
    public void thenHeShouldSeeTheTranslation(String translation) {
        endUser.shouldSeeTranslation(translation);
    }
}
