import groovy.lang.Singleton;
import libraries.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
   WebDriver driver = WebDriverUtility.getInstance();

public BaseTest(){

}

}
