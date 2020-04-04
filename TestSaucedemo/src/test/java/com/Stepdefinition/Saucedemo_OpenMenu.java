package com.Stepdefinition;

import com.pages.Saucedemo_Menu;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Saucedemo_OpenMenu {
	Saucedemo_Menu menu=new Saucedemo_Menu();
	
	@Given("^the user opens the chrome browser$")
    public void the_user_opens_the_chrome_browser() {
        menu.url();
    }
	
	@When("^login using (.+) and (.+)$")
    public void login_using_and(String username, String password) {
		menu.login(username,password);
    }

    @Then("^user opens the menu$")
    public void user_opens_the_menu() {
        menu.openMenu();
    }

    @Then("^user click on About$")
    public void user_click_on_about() {
        menu.clickAbout();
    }


}
