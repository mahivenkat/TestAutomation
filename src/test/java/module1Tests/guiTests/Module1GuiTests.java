package module1Tests.guiTests;


import libraries.ApiUtility;
import libraries.JsonUtility;
import libraries.TextFileUtility;
import libraries.WebDriverUtility;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageObjects.Module1Page;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Module1GuiTests {
    WebDriver webDriver = WebDriverUtility.getInstance();
    Module1Page module1Page = PageFactory.initElements(webDriver, Module1Page.class);



    @Test
    public void test_gui() throws InterruptedException, IOException {
        webDriver.get("https://www.youtube.com/channel/UCc79Etb6d6ISwCN4SeQgEJA/videos");
        String previousVal = "";
        int i = 0;
        if (i==0) {
            String dateTime = new SimpleDateFormat("EEE dd-MM-yyyy HH:mm:ss.SSS Z").format(new Date());
            if (i > 1) {
                webDriver.navigate().refresh();
            }

            new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                    until(ExpectedConditions.textToBePresentInElement(module1Page.getSubscribersCount(),
                            "subscribers"));
            String[] content = module1Page.getSubscribersCount().getText().split("subscribers");
            System.out.println(dateTime + ", " + content[0].trim
                    () + ", " + "subscribers - kundabaddalu2.0");

            if (!previousVal.equalsIgnoreCase(content[0].trim())) {
                previousVal = content[0].trim();
                TextFileUtility.appendContentToTextFile(dateTime + ", " + content[0].trim() + ", " + "subscribers - kundabaddalu2.0");
            }
            i = i + 1;
//            Thread.sleep(900000);//Every 15 mins

        }

    }

    @AfterMethod
    public void closeBrowser() {
        WebDriverUtility.getInstance().close();
        WebDriverUtility.getInstance().quit();

    }
}
