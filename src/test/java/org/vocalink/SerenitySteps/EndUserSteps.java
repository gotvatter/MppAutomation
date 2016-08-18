package org.vocalink.SerenitySteps;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;
import org.hamcrest.CoreMatchers;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps  {

private RequestSpecification spec  = RestAssured.with();
    @Step
    public void setsUpPreConditions() {
        spec.given().pathParam("keyparam", "key")
                .pathParam("keyvalueparam","value");
    }
    @Step
    public void sendsGetRequest() {
        spec.when().get("http://echo.jsontest.com/{keyparam}/{keyvalueparam}/one/two");

    }
    @Step
    public void checksTheResponse() {

        spec.then().body(CoreMatchers.containsString("three"));
    }
}