package test;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import site.pages.HomePage;

public class ExampleTests implements BaseTest {
    HomePage homePage = new HomePage();

    @Test
    @Description("Example Test")
    public void openPageTest() {
        homePage.openPage();
        homePage.moreInformationLink.click();
    }
}
