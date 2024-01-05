package site.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

// This is an example of Page Object definition. To be removed
public class HomePage extends BasePage {
    private static final String PATH = "/";
    private static final String TITLE = "/";
    public SelenideElement moreInformationLink = $("p > a");

    public HomePage() {
        super(TITLE, PATH);
    }
}
