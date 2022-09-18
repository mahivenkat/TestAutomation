package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Module1Page {
    @FindBy(xpath = "//yt-formatted-string[@id='subscriber-count']")
    private WebElement subscribersCount;

    public WebElement getSubscribersCount() {
        return subscribersCount;
    }

    public void setSubscribersCount(WebElement subscribersCount) {
        this.subscribersCount = subscribersCount;
    }
}
