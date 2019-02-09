package ua.startit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import ua.startit.pageobjects.HomePage;

import static com.codeborne.selenide.Selenide.open;
import static ua.startit.SignUpTest.*;

public class SignInTest extends BaseTest {

    @Test(groups = {"Smoke", "Regression"})
    public void signTest() {
        HomePage homePage = new HomePage();
        homePage
                .clickOnSignIn()
                .setUsername(formattedEmailAddress)
                .setPassword(PASSWORD)
                .submit();

        Assert.assertTrue(homePage.isNameDisplayed(FIRST_NAME),
                "Blah-blah");
    }

}
