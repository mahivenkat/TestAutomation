package libraries;

import groovy.lang.Singleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtility {
    private static WebDriver webDriver;
    public static WebDriver getInstance(){
        if(webDriver == null){
            synchronized (Singleton.class){
                if(webDriver == null){
                    if(System.getProperty("browserName", "chrome222").equalsIgnoreCase("chrome")) {
                        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak Dontineni\\me\\untitled\\BrowserDrivers\\chromedriver.exe");
                        webDriver = new ChromeDriver();
                    }
                    if(System.getProperty("browserName").equalsIgnoreCase("firefox")) {

                    }
                    if(System.getProperty("browserName").equalsIgnoreCase("ie")) {

                    }
                }
            }
        }
        return  webDriver;
    }
}
