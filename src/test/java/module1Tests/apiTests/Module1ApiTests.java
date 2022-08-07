package module1Tests.apiTests;

import libraries.ApiUtility;
import libraries.JsonUtility;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Module1ApiTests {
    ApiUtility apiUtility = new ApiUtility();


    @Test(priority = 0, groups = {"Regression"})
    public void test_postApi() {
        System.out.println(Thread.currentThread().getId());
        System.out.println("Test post api");
        JSONObject jsonObject = JsonUtility.readJsonFile(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\Module1Jons\\createUser.json");
        jsonObject.put("name", "venkat");
        Map headers = new HashMap();
        headers.put("Content-Type", "application/json");

        apiUtility.postApi("https://reqres.in/api/users", headers, jsonObject.toJSONString());
        System.out.println(apiUtility.getResponse().prettyPrint());
    }

    @Test(priority = 1, groups = {"Smoke", "Regression"})
    public void test_getApi() {
        System.out.println("reading param directly from maven cli: " + System.getProperty("param1"));

        System.out.println(Thread.currentThread().getId());
        System.out.println("Test get api");
        apiUtility.getApi("https://reqres.in/api/users?page=2");
//        apiUitlity.verifyResponse(apiUitlity.getResponse(),"","");
        System.out.println(apiUtility.getResponse().jsonPath().getList("data").get(0).toString());
    }

    @Test(priority = 2, groups = {"Regression"})
    public void test_putApi() {
        System.out.println(Thread.currentThread().getId());

        System.out.println("Test put api");
        JSONObject jsonObject = JsonUtility.readJsonFile(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\Module1Jons\\createUser.json");
        jsonObject.put("name", "venkat");
        Map headers = new HashMap();
        headers.put("Content-Type", "application/json");

        apiUtility.putApi("https://reqres.in/api/users/589", headers, jsonObject.toJSONString());
        System.out.println(apiUtility.getResponse().prettyPrint());
        Assert.assertTrue(apiUtility.getResponse().statusCode() == 200, "Verifying the put api statu code");

    }

    @Test(priority = 3, groups = {"Regression"})
    public void test_deleteApi() {
        System.out.println(Thread.currentThread().getId());
        System.out.println("Delete api test");
        apiUtility.deleteApi("https://reqres.in/api/users/839");
        System.out.println(apiUtility.getResponse().prettyPrint());
        Assert.assertTrue(apiUtility.getResponse().statusCode() == 204, "Verifying the delete api statu code");
    }

}
