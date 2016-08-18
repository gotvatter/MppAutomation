package org.vocalink.demo;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.internal.mapper.ObjectMapperType;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.number.OrderingComparison.lessThan;


public class JunitDemoTestsClass {
    Registration registration;

    @Test
    public void basicPingTest() {
        given().when().get(" http://echo.jsontest.com/key/value/one/two").then().statusCode(200);
    }

    @Test
    public void secondaryPingTest() {
        given().when().get("http://echo.jsontest.com/key/value/one/two").then().body(containsString("three"));
    }


    @Test
    public void RequestresponseTime() {
        long time = given().when().get("http://echo.jsontest.com/key/value/one/two").timeIn(TimeUnit.SECONDS);
        System.out.println(time);
    }

    @Test
    public void responseTime() {
        given().when().get("http://echo.jsontest.com/key/value/one/two").then().time(lessThan(2000L));
    }

    @Test
    public void deSerealeaseResponseExplicitMapper() {
        DummyJsonClass dummyJsonClass = given().when().get("http://echo.jsontest.com/key/value/one/two")
                .as(DummyJsonClass.class, ObjectMapperType.GSON);
        Assert.assertEquals(dummyJsonClass.getKey(), "value1");


    }

    /***
     * JunitDemoTestsClass (GET)
     */
    @Test
    public void deSerealeaseResponseStringComparison() {
        given().when().get("http://echo.jsontest.com/key/value/one/two")
                .then().body(containsString("{\n" +
                "   \"one\": \"two\",\n" +
                "   \"key\": \"value\"\n" +
                "}"));


    }

    @Test
    public void verifyJsonKeys() {
        given().pathParam("keyparam", "key")
                .pathParam("keyvalueparam", "value")
                .when().get("http://echo.jsontest.com/{keyparam}/{keyvalueparam}/one/two").then().log().body()
                .body("key", equalTo("value1"))
                .assertThat()
                .contentType(ContentType.JSON);
    }

    /***
     * Registration (POST)
     */
    @Test
    public void aCarGoesIntoTheGarage() {


        given().contentType("application/json")
                .body(registration)
                .when().post("http://icap5401.test.vocalink.co.uk:55721" +
                "/mpp-registration/v1.0/registration/participant/ENDY/register")
                .then()
                .statusCode(200).assertThat()
                .body(equalTo("{\"registrations\":[{\"registrationId\":999999999991,\"responseCode\":\"000\"}]}"));


    }
}

