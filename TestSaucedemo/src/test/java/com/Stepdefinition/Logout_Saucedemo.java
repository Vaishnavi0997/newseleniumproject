package com.Stepdefinition;

import com.pages.Saucedemo_Logout;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logout_Saucedemo {
	Saucedemo_Logout logout=new Saucedemo_Logout();
	
	@Given("^opens the chrome$")
    public void opens_the_chrome() {
        logout.url();
    }
	
	@When("^login to Saucedemo (.+) and (.+)$")
    public void login_to_saucedemo_and(String username, String password) {
		logout.login(username,password); 
    }

    @Then("^user opens  menu$")
    public void user_opens_menu() {
        logout.openMenu();
    }

    @Then("^user click on Logout$")
    public void user_click_on_logout() {
        logout.clickLogout();
    }

}
