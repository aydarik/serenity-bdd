package ru.gumerbaev.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://translate.google.ru/#en/ru")
public class TranslatePage extends PageObject {

	@FindBy(id = "source")
	@SuppressWarnings("unused")
	private WebElementFacade searchTerms;

	public void enterPhrase(String phrase) {
		searchTerms.type(phrase);
	}

	public void waitResult() {
		waitFor("#result_box > span");
	}

	public String getTranslation() {
		WebElementFacade translationBox = find(By.id("result_box"));
		return translationBox.findElement(By.tagName("span")).getText();
	}
}