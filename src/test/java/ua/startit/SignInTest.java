package ua.startit;

import org.testng.annotations.Test;
import ua.startit.pageobjects.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class SignInTest extends BaseTest {

    @Test
    public void signTest() {
        new HomePage()
                .clickOnSignIn()
                .setUsername("")
                .setPassword("");
    }

}
