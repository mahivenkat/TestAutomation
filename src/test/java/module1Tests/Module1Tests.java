package module1Tests;


import libraries.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Module1Tests {
    WebDriver driver = WebDriverUtility.getInstance();


    @Test
    public void test1(){
        System.out.println("Test1");
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
