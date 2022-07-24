package libraries;

import groovy.lang.Singleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtility {
    private static WebDriver webDriver;
    private WebDriverUtility(){
    }
    public static WebDriver  getInstance(){
        if(webDriver == null){
            synchronized (Singleton.class){
                if(webDriver == null){
                    System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak Dontineni\\Downloads\\chromedriver_win32\\chromedriver.exe");
                    webDriver = new ChromeDriver();
                }
            }
        }
        return  webDriver;
    }
}
