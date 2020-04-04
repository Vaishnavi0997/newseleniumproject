package com.Stepdefinition;

import com.pages.Saucedemo_SelectProduct;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Saucedemo_Product {
	
	Saucedemo_SelectProduct product = new Saucedemo_SelectProduct();
		
	 @Given("^the user opens the browser$")
	    public void the_user_opens_the_browser() {
	        product.url();
	    }

	    @When("^the user login to Saucedemo using (.+) and (.+)$")
	    public void the_user_login_to_saucedemo_using_and(String username, String password){
	        product.login(username,password);
	    }

	    @Then("^the user select the product$")
	    public void the_user_select_the_product() {
	    	product.selectProduct();
	    }

	    @Then("^adds the product to Add Cart$")
	    public void adds_the_product_to_add_cart()  {
	        product.addToCart();
	    }


}
