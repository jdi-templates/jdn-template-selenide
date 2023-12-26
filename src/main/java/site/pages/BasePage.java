package site.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.open;

// This is an example of Page Object definition.
// ADD PAGES CLASS WITH URLS AS PATH

public abstract class BasePage {


    protected String PATH;
    protected String TITLE;

    public BasePage(final String title, final String path) {
        this.PATH = path;
        this.TITLE = title;
    }

    public void openPage() {
        Selenide.open(this.PATH);
    }
}
