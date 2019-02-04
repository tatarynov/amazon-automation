package ua.startit;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected static final String URL = "https://www.amazon.com";

    @BeforeTest(alwaysRun = true)
    public void setEnv() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.baseUrl = URL;
    }

    @BeforeMethod(alwaysRun = true)
    public void openHomePage() {
        Selenide.open("/");
    }

    @AfterTest(alwaysRun = true)
    public void closeBrowser() {
        Selenide.close();
    }
}
