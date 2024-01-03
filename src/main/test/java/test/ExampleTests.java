package test;

import org.testng.annotations.Test;
import site.pages.FirstPage;

public class ExampleTests implements BaseTest {
    FirstPage firstPage = new FirstPage();

    @Test
    public void openPageTest() {
        firstPage.openPage();
    }
}
