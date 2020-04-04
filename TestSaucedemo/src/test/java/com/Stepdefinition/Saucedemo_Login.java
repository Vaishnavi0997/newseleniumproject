package com.Stepdefinition;


import com.pages.Saucedemo_LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Saucedemo_Login {
	Saucedemo_LoginPage mylogin=new Saucedemo_LoginPage();

	
	@Given("^the user launch the chrome application$")
    public void the_user_launch_the_chrome_application()  {
		mylogin.url();  
    }

	// the space i removed and it is working now
    @When("^the user open the Saucedemo Home page$")
    public void the_user_open_the_saucedemo_home_page()  {
    	mylogin.LoginPage();     
    }

    @Then("^the user login using (.+) and (.+)$")
    public void the_user_login_using_username_and_password(String username, String password)  {
    	mylogin.LoginDeatils(username,password);   
    }

    @Then("^click on the login button user nagivate to the next page$")
    public void click_on_the_login_button_user_nagivate_to_the_next_page() {
    	mylogin.submit();
    }


}
