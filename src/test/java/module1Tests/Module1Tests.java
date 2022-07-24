package module1Tests;


import libraries.TextFileUtility;
import libraries.WebDriverUtility;
import org.apache.groovy.json.internal.Exceptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pageObjects.Module1Page;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Module1Tests {
    WebDriver webDriver = WebDriverUtility.getInstance();
    Module1Page module1Page = PageFactory.initElements(webDriver, Module1Page.class);

    @Test
    public void test1() throws InterruptedException, IOException {
        webDriver.get("https://www.youtube.com/channel/UCc79Etb6d6ISwCN4SeQgEJA/videos");
        String previousVal = "";
        int i = 0;
        while(true){
            String dateTime = new SimpleDateFormat("EEE dd-MM-yyyy HH:mm:ss.SSS Z").format(new Date());
            if(i>0){
                webDriver.navigate().refresh();
            }

            new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                    until(ExpectedConditions.textToBePresentInElement(module1Page.getSubscribersCount(),
                            "subscribers"));
            String[] content = module1Page.getSubscribersCount().getText().split("subscribers");
            System.out.println(dateTime + ", " + content[0].trim
                    () + ", " + "subscribers");

            if(!previousVal.equalsIgnoreCase(content[0].trim()) ){
                previousVal = content[0].trim();
                TextFileUtility.appendContentToTextFile(dateTime + ", " + content[0].trim() + ", " + "subscribers - kundabaddalu2.0");
            }

            Thread.sleep(900000);//Every 15 mins

       }

    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @Test
    public void test3() {
        System.out.println("Test3");
    }

    @Test
    public void test4() {
        System.out.println("Test4");
    }

    @AfterClass
    public void closeBrowser() {
        WebDriverUtility.getInstance().quit();
    }
}
