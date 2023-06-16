package org.stepdefenition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Stepdefenition {
	RequestSpecification req;
	io.restassured.response.Response response;

	@Given("Hit the APi")
	public void hit_the_a_pi() {
		RestAssured.baseURI="https://reqres.in/";
	    
	}
	@When("Get the response from website")
	public void get_the_response_from_website() {
		req=RestAssured.given();
		response=req.get("https://reqres.in/api/users?page=2");
	   
	}
	@When("print the response")
	public void print_the_response() {
		response.prettyPrint();
	   
	}
	@Then("print the particular path")
	public void print_the_particular_path() {
		Assert.assertEquals(response.statusCode(), 200);
		System.out.println(response.statusCode());
		System.out.println(response.jsonPath().getString("data[4].email"));
	   
	}



}
