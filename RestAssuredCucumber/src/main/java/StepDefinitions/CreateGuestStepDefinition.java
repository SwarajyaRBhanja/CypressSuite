package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.*;

import java.util.ArrayList;
import java.util.List;

public class AddToCartStepDefinition {

    RequestSpecification httpRequest;
    Response response;

    @Given("^User sets the base API request <URL>$")
    public void user_sets_the_base_api_url(String url) {

        RestAssured.baseURI= url;

        throw new io.cucumber.java.PendingException();
    }


}
