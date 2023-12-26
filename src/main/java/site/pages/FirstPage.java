package site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;

// This is an example of Page Object definition. To be removed
public class FirstPage extends WebPage {
    @UI("//button")
    public static Button testButton;
}
