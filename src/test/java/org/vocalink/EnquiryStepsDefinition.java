package org.vocalink;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.vocalink.SerenitySteps.EndUserSteps;

/**
 * Created by dcoslet on 8/13/2016.
 */
public class EnquiryStepsDefinition {

    @Steps
    EndUserSteps dorin;

    @Given("registration is existent in MPP")
    public void givenRegIsExistent() {
        dorin.setsUpPreConditions();
    }

    @When("i send a valid enquiry request")
    public void whenGetRequestIsPerformed() {
        dorin.sendsGetRequest();
    }


    @Then("i should receive details of  registration as response")
    public void thenResponseIsReturned() {
        dorin.checksTheResponse();
    }


}
