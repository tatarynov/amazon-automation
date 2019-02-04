package ua.startit.pageobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private By username = By.id("ap_email");
    private By password = By.id("ap_password");
    private By signUpButton = By.id("auth-create-account-link");

    public SignInPage setUsername(String username) {
        $(username).setValue(username);
        return this;
    }

    public SignInPage setPassword(String password) {
        $(password).setValue(password);
        return this;
    }

    public SignUpPage signUp() {
        $(signUpButton).click();
        return new SignUpPage();
    }
}
