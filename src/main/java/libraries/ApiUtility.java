package libraries;

import io.restassured.RestAssured;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;


public class ApiUtility {
    private RequestSpecification requestSpecification = RestAssured.given();
    RequestSpecificationImpl requestSpecificationImpl;
    private Response response;

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Response getApi(String url) {

        setResponse(getRequestSpecification().when().get(url));
        return getResponse();

    }

    public Response postApi(String url, Map headers, String reqBody){
        // Add a header stating the Request body is a JSON
        if(!headers.isEmpty()) {
            requestSpecification.headers(headers); // Add the Json to the body of the request
        }
//        requestSpecification.basePath("");
//        requestSpecification.baseUri("");
//        requestSpecification.params(null);
//        requestSpecification.pathParams(null);
//        requestSpecification.queryParams(null);
//        requestSpecification.relaxedHTTPSValidation();
        requestSpecification.body(reqBody); // Post the request and check the response
        setResponse(getRequestSpecification().when().post(url));
        return getResponse();
    }

    public Response putApi(String url, Map headers, String reqBody){
        // Add a header stating the Request body is a JSON
        if(!headers.isEmpty()) {
            requestSpecification.headers(headers); // Add the Json to the body of the request
        }
//        requestSpecification.basePath("");
//        requestSpecification.baseUri("");
//        requestSpecification.params(null);
//        requestSpecification.pathParams(null);
//        requestSpecification.queryParams(null);
//        requestSpecification.relaxedHTTPSValidation();
        requestSpecification.body(reqBody); // Post the request and check the response
        setResponse(getRequestSpecification().when().put(url));
        return getResponse();
    }

    public Response deleteApi(String url){
        setResponse(getRequestSpecification().when().delete(url));
        return getResponse();
    }


    public void verifyStatusCode(Response response, int statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }

}
