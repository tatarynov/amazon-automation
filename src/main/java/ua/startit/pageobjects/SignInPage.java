package ua.startit.pageobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private By username = By.id("ap_email");
    private By password = By.id("ap_password");
    private By submit = By.id("signInSubmit");
    private By signUpButton = By.id("auth-create-account-link");

    public SignInPage setUsername(String username) {
        $(this.username).setValue(username);
        return this;
    }

    public SignInPage setPassword(String password) {
        $(this.password).setValue(password);
        return this;
    }

    public HomePage submit() {
        $(submit).click();
        return new HomePage();
    }

    public SignUpPage signUp() {
        $(signUpButton).click();
        return new SignUpPage();
    }
}
