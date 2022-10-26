package com.POM.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login 
{
	
	

	
	WebDriver driver;
		
	public Login(WebDriver driver) 
	{
		
		this.driver = driver;
	}
	
	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement Login;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextbtn;
	
	
	//@FindBy(xpath ="//div[text()='Enter your password']")
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	/*
	 * @FindBy(xpath = "//span[text()='Next']") WebElement nextbtn2;
	 */
	
	
	
	public void login1() throws InterruptedException
	{
		Login.sendKeys("autoprac7@gmail.com");
		
		nextbtn.click();
		Thread.sleep(7000);
		//
    	password.sendKeys("Asdfghjkl@1");
    	Thread.sleep(2000);
    	nextbtn.click();
	}


   
	
	

		
	

}
