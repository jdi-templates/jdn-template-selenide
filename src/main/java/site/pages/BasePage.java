package site.pages;

import com.codeborne.selenide.Selenide;
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
