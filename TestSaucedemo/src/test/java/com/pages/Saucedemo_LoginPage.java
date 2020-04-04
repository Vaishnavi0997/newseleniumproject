package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo_LoginPage {
	WebDriver driver;
	By username=By.id("user-name");
	By password=By.id("password");
	By loginbutton=By.xpath("//*[@id=\'login_button_container\']/div/form/input[3]");
	
	
	public void url() { 
		System.setProperty("webdriver.chrome.driver",  "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void LoginPage() 
	{
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}
	public void LoginDeatils(String username, String password) 
	{
	
		
		driver.findElement(this.username).sendKeys(username); 
		driver.findElement(this.password).sendKeys(password); 
		
		
	}
	public void submit() 
	{
		driver.findElement(loginbutton).click(); 

	}
	
	

	
}
