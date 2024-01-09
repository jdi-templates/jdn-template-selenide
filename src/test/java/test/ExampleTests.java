package test;

import org.testng.annotations.Test;
import site.pages.HomePage;

public class ExampleTests implements BaseTest {
    HomePage homePage = new HomePage();

    @Test(description = "Example test")
    public void openPageTest() {
        homePage.openPage();
        homePage.moreInformationLink.click();
    }
}
