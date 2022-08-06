package libraries;

import groovy.lang.Singleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtility {
    private WebDriver webDriver;
    public WebDriver getInstance(){
        if(webDriver == null){
            synchronized (Singleton.class){
                if(webDriver == null){
                    System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak Dontineni\\me\\untitled\\BrowserDrivers\\chromedriver.exe");
                    webDriver = new ChromeDriver();
                }
            }
        }
        return  webDriver;
    }
}
