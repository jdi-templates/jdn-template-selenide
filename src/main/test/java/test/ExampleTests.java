package test;

import org.testng.annotations.Test;
import site.MySite;

public class ExampleTests implements BaseTest {
    @Test
    public void openPageTest() {
        MySite.firstPage.openPage();
    }
}
