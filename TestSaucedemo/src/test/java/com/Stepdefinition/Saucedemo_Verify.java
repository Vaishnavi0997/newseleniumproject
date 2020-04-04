package com.Stepdefinition;

import com.pages.Saucedemo_VerifyPrdouctAdded;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Saucedemo_Verify {
	Saucedemo_VerifyPrdouctAdded cart=new Saucedemo_VerifyPrdouctAdded();
	
	@Given("^the user opens the chrome$")
    public void the_user_opens_the_chrome() {
        cart.url();
    }

    @When("^user login using (.+) and (.+)$")
    public void user_login_using_and(String username, String password){
        cart.login(username,password);
    }

    @Then("^the user select the product and add to cart$")
    public void the_user_select_the_product_and_add_to_cart() {
        cart.selectProduct();
    }

    @Then("^check product is added to cart or not$")
    public void check_product_is_added_to_cart_or_not() {
        cart.verify();
    }


}
