package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.FileDownloadMode.FOLDER;
import static java.lang.Boolean.parseBoolean;
import static java.lang.System.getProperty;

@Listeners()
public interface BaseTest {
    String baseUrl = getProperty("base.url", "https://example.com");
    String browser = getProperty("browser", "chrome");
    boolean headless = parseBoolean(getProperty("headless", "true"));

    @BeforeSuite
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true)
                .savePageSource(false));
        Configuration.baseUrl = baseUrl;
        Configuration.browser = browser; // You can also use "firefox", "edge", etc.
        Configuration.pageLoadTimeout = 20000;
        Configuration.headless = headless;
        Configuration.browserSize = "1920x1200";
        Configuration.screenshots = true;
        Configuration.fileDownload = FOLDER;
    }

    @AfterSuite

    public static void tearDown() {
        SelenideLogger.removeListener("AllureSelenide");
        Selenide.closeWebDriver();
    }
}
