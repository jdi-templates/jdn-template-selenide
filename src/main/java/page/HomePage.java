package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {
    private static final String PATH = "/";
    private static final String TITLE = "/";
    public SelenideElement moreInformationLink = $("p > a").as("more information link");

    public HomePage() {
        super(TITLE, PATH);
    }
}
