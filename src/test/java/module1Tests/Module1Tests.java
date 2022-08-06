package module1Tests;


import base.BaseTest;
import libraries.ApiUtility;
import libraries.JsonUtility;
import libraries.TextFileUtility;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageObjects.Module1Page;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Module1Tests extends BaseTest {
    WebDriver webDriver = super.getDriver();
    Module1Page module1Page = PageFactory.initElements(webDriver, Module1Page.class);
    ApiUtility apiUtility = new ApiUtility();


    @Test
    public void test_gui() throws InterruptedException, IOException {
        webDriver.get("https://www.youtube.com/channel/UCc79Etb6d6ISwCN4SeQgEJA/videos");
        String previousVal = "";
        int i = 0;
        if (true) {
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
            Thread.sleep(900000);//Every 15 mins

        }

    }

    @Test
    public void test_getApi() {
        System.out.println("Test get api");
        apiUtility.getApi("https://reqres.in/api/users?page=2");
//        apiUitlity.verifyResponse(apiUitlity.getResponse(),"","");
        System.out.println(apiUtility.getResponse().jsonPath().getList("data").get(0).toString());
    }

    @Test
    public void test3() {
        System.out.println("Test3");
    }

    @Test
    public void test_postApi() {
        System.out.println("Test post api");
        JSONObject jsonObject = JsonUtility.readJsonFile(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\Module1Jons\\createUser.json");
        jsonObject.put("name", "venkat");
        Map headers = new HashMap();
        headers.put("Content-Type", "application/json");

        apiUtility.postApi("https://reqres.in/api/users", headers, jsonObject.toJSONString());
        System.out.println(apiUtility.getResponse().prettyPrint());
    }

    @Test
    public void test_putApi() {
        System.out.println("Test put api");
        JSONObject jsonObject = JsonUtility.readJsonFile(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\Module1Jons\\createUser.json");
        jsonObject.put("name", "venkat");
        Map headers = new HashMap();
        headers.put("Content-Type", "application/json");

        apiUtility.putApi("https://reqres.in/api/users", headers, jsonObject.toJSONString());
        System.out.println(apiUtility.getResponse().prettyPrint());
        Assert.assertTrue(apiUtility.getResponse().statusCode() == 201, "Verifying the put api statu code");

    }

    @Test
    public void test_deleteApi() {
        System.out.println("Delete api test");
        apiUtility.deleteApi("https://reqres.in/api/users/839");
        System.out.println(apiUtility.getResponse().prettyPrint());
        Assert.assertTrue(apiUtility.getResponse().statusCode() == 204, "Verifying the delete api statu code");
    }

    @AfterClass
    public void closeBrowser() {
        super.getDriver().quit();
    }

    @AfterMethod
    public void closeBr() {
        super.getDriver().quit();

    }
}
