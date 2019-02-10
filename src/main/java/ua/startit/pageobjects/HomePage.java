package ua.startit.pageobjects;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    private By inputFieldLocator = By.id("twotabsearchtextbox");
    private By signIn = By.cssSelector("#nav-link-accountList");


    @Step("Search for {} text")
    public void search(String text) {
        $(inputFieldLocator)
                .setValue(text)
                .submit();
    }

    @Step("Click on Sign in button")
    public SignInPage clickOnSignIn() {
        $(signIn)
                .should(Condition.enabled)
                .click();

        return new SignInPage();
    }

    @Step("Check if {} is displayed")
    public boolean isNameDisplayed(String firstName) {
        $(By.xpath(String.format("//span[text()='Hello, %s']", firstName))).should(Condition.visible);
        return true;
    }
}
