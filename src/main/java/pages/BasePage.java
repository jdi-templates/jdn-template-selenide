package pages;

import com.codeborne.selenide.Selenide;
public abstract class BasePage {


    protected String path;
    protected String title;

    protected BasePage(final String title, final String path) {
        this.path = path;
        this.title = title;
    }

    public void openPage() {
        Selenide.open(this.path);
    }
}
