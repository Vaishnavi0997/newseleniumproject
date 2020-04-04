package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo_VerifyPrdouctAdded {
	WebDriver driver;
	By username=By.id("user-name");
	By password=By.id("password");
	By loginbutton=By.xpath("//*[@id=\'login_button_container\']/div/form/input[3]");
	By selectproduct=By.linkText("Test.allTheThings() T-Shirt (Red)");
	By addcart=By.xpath("//*[@id=\'inventory_item_container\']/div/div/div/button");
	By backbtn=By.xpath("//*[@id=\'inventory_item_container\']/div/button");
	By selectproduct2=By.xpath("//*[@id=\'inventory_container\']/div/div[2]/div[3]/button");
	By cart=By.id("shopping_cart_container");
	By continueshopping=By.linkText("CONTINUE SHOPPING");
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
		//to select product
		driver.findElement(selectproduct).click();
		driver.findElement(addcart).click();
		driver.findElement(backbtn).click();
		//selecting another product
		driver.findElement(selectproduct2).click();
	}
	public void verify() {
		driver.findElement(cart).click();
		System.out.println("product is added");
		//to continue shopping
		driver.findElement(continueshopping).click();
		
	}

}
