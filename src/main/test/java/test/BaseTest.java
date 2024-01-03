package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.FileDownloadMode.FOLDER;

@Listeners()
public interface BaseTest {
    @BeforeSuite
    public static void setUp() {
        Configuration.baseUrl = "https://www.example.com";
        Configuration.browser = "chrome"; // You can also use "firefox", "edge", etc.
        Configuration.pageLoadTimeout = 20000;
        Configuration.headless = false;
        Configuration.browserSize = "1920x1200";
        Configuration.screenshots = true;
        Configuration.fileDownload = FOLDER;
    }

    @AfterSuite
    public static void tearDown() {
        // Close all open browsers
        Selenide.closeWebDriver();
    }
}
