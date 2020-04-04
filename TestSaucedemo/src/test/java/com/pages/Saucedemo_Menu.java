package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo_Menu {
	WebDriver driver;
	By username=By.id("user-name");
	By password=By.id("password");
	By loginbutton=By.xpath("//*[@id=\'login_button_container\']/div/form/input[3]");
	By clickMenu=By.xpath("//*[@id=\'menu_button_container\']/div/div[3]/div/button");
	By about=By.id("about_sidebar_link");
	By platform=By.linkText("Platform");
	By selenium=By.linkText("Selenium");
	
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
	public void openMenu() {
		driver.findElement(clickMenu).click();
	}
	public void clickAbout() {
		driver.findElement(about).click();	
		driver.findElement(platform).click();
		driver.findElement(selenium).click();
	}

}
