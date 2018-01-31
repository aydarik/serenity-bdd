package ru.gumerbaev.test.steps.serenity;

import net.thucydides.core.annotations.Step;
import ru.gumerbaev.test.pages.TranslatePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EndUserSteps {

    @SuppressWarnings("unused")
    private TranslatePage translatePage;

	@Step
    public void openThePage() {
        translatePage.open();
    }

	@Step
    public void looksFor(String phrase) {
		translatePage.enterPhrase(phrase);
		translatePage.waitResult();
    }

	@Step
	public void shouldSeeTranslation(String translation) {
		assertThat(translatePage.getTranslation(), equalTo(translation));
	}
}