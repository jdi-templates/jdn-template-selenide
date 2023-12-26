package site.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

// This is an example of Page Object definition. To be removed
public class FirstPage extends BasePage {
    private static final String PATH = "/";
    private static final String TITLE = "/";
    public static SelenideElement testButton = $("button");

    public FirstPage() {
        super(TITLE, PATH);
    }
}
