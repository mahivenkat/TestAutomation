package module1Tests;


import libraries.TextFileUtility;
import libraries.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pageObjects.Module1Page;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Module1Tests {
    WebDriver webDriver = WebDriverUtility.getInstance();
    Module1Page module1Page = PageFactory.initElements(webDriver, Module1Page.class);

    @Test
    public void test1() throws InterruptedException, IOException {
        webDriver.get("https://www.youtube.com/channel/UCc79Etb6d6ISwCN4SeQgEJA/videos");
        for(int i = 0; i<=10000000; i++){
            String dateTime = new SimpleDateFormat("EEE dd-MM-yyyy HH:mm:ss.SSS Z").format(new Date());
            String [] content = module1Page.getSubscribersCount().getText().split("subscribers");
            System.out.println(dateTime + ", " + content [0].trim() + ", " + "subscribers");
            Thread.sleep(300000);
            webDriver.navigate().refresh();
            TextFileUtility.appendContentToTextFile(dateTime + ", " + content [0].trim() + ", " + "subscribers");
        }


    }
    @Test
    public void test2(){
        System.out.println("Test2");
    }
    @Test
    public void test3(){
        System.out.println("Test3");
    }
    @Test
    public void test4(){
        System.out.println("Test4");
    }
    @AfterClass
    public void closeBrowser(){
        WebDriverUtility.getInstance().quit();
    }
}
