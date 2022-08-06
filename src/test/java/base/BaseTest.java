package base;

import groovy.lang.Singleton;
import libraries.CommonUtility;
import libraries.WebDriverUtility;
import models.appProperties.AppPropertiesModel;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    private WebDriver driver;
    private CommonUtility commonUtility = new CommonUtility();
    private AppPropertiesModel appPropertiesModel;
    public BaseTest() {
        this.driver = new WebDriverUtility().getInstance();
    }

    public WebDriver getDriver() {
        return driver;
    }


    public AppPropertiesModel getAppPropertiesModel() {
        return appPropertiesModel;
    }

    public void setAppPropertiesModel() {
        this.appPropertiesModel = commonUtility.readYml();
    }

}
