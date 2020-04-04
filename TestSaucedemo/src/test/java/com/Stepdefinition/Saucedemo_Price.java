package com.Stepdefinition;

import com.pages.Saucedemo_SelectingPrice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Saucedemo_Price {
	Saucedemo_SelectingPrice price=new Saucedemo_SelectingPrice();
	
	@Given("^the user launch chrome$")
    public void the_user_launch_chrome() {
        price.url();
    }

    @When("^the user login Saucedemo using (.+) and (.+)$")
    public void the_user_login_saucedemo_using_and(String username, String password){
        price.login(username,password);
    }

    @Then("^select the price range from low to high$")
    public void select_the_price_range_from_low_to_high() {
        price.priceRange();
    }

	



}
