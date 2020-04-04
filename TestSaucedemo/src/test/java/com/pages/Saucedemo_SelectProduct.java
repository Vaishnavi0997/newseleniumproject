package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo_SelectProduct {
	WebDriver driver;
	By username=By.id("user-name");
	By password=By.id("password");
	By loginbutton=By.xpath("//*[@id=\'login_button_container\']/div/form/input[3]");
	By selectproduct=By.linkText("Sauce Labs Bolt T-Shirt");
	By addcart=By.xpath("//*[@id=\'inventory_item_container\']/div/div/div/button");
	public void url() { 
		System.setProperty("webdriver.chrome.driver",  "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	}
	public void login(String username, String password) 
	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(this.username).sendKeys(username); 
		driver.findElement(this.password).sendKeys(password); 
		driver.findElement(loginbutton).click(); 
	}
	public void selectProduct() {
		driver.findElement(selectproduct).click();
	}
	public void addToCart() {
		driver.findElement(addcart).click();
	}


}
