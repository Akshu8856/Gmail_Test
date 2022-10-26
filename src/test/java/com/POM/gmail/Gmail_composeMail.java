package com.POM.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gmail_composeMail 
{
	
	WebDriver driver;
	
	public Gmail_composeMail(WebDriver driver) 
	{
		
		this.driver = driver;
	}
	
	@FindBy(xpath = "//div[text()='Compose']")
	WebElement composebtn;
	
	
	@FindBy(xpath="//div[@class='aH9']/input")
	WebElement to;
	
	@FindBy(name = "subjectbox")
	WebElement subject;
	
	@FindBy(xpath="//div[@aria-label='Message Body']")
	WebElement msgBody;
	
	@FindBy(xpath="//div[text()='Send']")
	WebElement SendBtn;
	
	
	public void composmail() throws InterruptedException
	{
		Thread.sleep(3000);
		composebtn.click();
		Thread.sleep(4000);
		to.sendKeys("autoprac7@gmail.com");
		Thread.sleep(3000);
		subject.sendKeys("Incubyte");
		Thread.sleep(5000);
		msgBody.sendKeys("Automation QA test for Incubyte");
		Thread.sleep(3000);
		SendBtn.click();
		
		
		
	}
	
	
	
	
	
	
	/*
	public void composebtn() throws InterruptedException
	{
		Thread.sleep(3000);
		composebtn.click();
		
	}
	
	public void to(String email) throws InterruptedException
	{
		Thread.sleep(4000);
		to.sendKeys("autoprac7@gmail.com");
		
	}
	
	public void Subject() throws InterruptedException
	{
		Thread.sleep(3000);
		subject.sendKeys("Incubyte");
		
	}
	
	public void message() throws InterruptedException
	{
		
	
		Thread.sleep(5000);
		msgBody.sendKeys("Automation QA test for Incubyte");
	}
	public void SendBtn() throws InterruptedException
	{
	
		Thread.sleep(3000);
		SendBtn.click();
	}	
		
		
		*/
	
	

}
