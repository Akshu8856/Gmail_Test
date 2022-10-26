package Gmail_Step_Defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.POM.gmail.Gmail_composeMail;
import com.POM.gmail.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Gmail_functionality 
{
	WebDriver driver;
	Login login;
	Gmail_composeMail  composemail;
	
	
	
	
	@Given("navigate to Gmail page")
	public void navigate_to_gmail_page() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chromedriver\\ch106\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");	
		
		
	}

	@When("user logged in using Valid credintial")
	public void user_logged_in_using_valid_credintial() throws InterruptedException 
	{
		login=PageFactory.initElements(driver,Login.class);
		login.login1();
	 }
	
	
	@Then("User sends an Email with Subject and with message.")
	public void user_sends_an_email_with_subject_and_with_message() throws InterruptedException {
	    
	    
	    composemail=PageFactory.initElements(driver, Gmail_composeMail.class);
	    composemail.composmail();;

	}

	
	
	
	
	
/*
	@Then("home page should be displayed")
	public void home_page_should_be_displayed() 
	{
		
		String expectedText="Gmail";
	      String actualText= driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[1]/div[4]/div/a/img/..")).getText();
	      Assert.assertTrue("Login not successful",expectedText.equals(actualText));
	      
	   
	}

	@Given("User Should click on Compose btn")
	public void user_should_click_on_compose_btn() throws InterruptedException 
	{
		composemail=PageFactory.initElements(driver, Gmail_composeMail.class);
		composemail.composebtn();
	    
	}

	@Then("User Should insert mail id")
	public void user_should_insert_mail_id() throws InterruptedException {
		composemail=PageFactory.initElements(driver, Gmail_composeMail.class);
		composemail.to();
		
	}

	@Then("Subject and message")
	public void subject_and_message() throws InterruptedException {
		composemail=PageFactory.initElements(driver, Gmail_composeMail.class);
		composemail.Subject();
		composemail.message();
	}

	@Then("click on send button")
	public void click_on_send_button() throws InterruptedException {
		composemail=PageFactory.initElements(driver, Gmail_composeMail.class);
		composemail.SendBtn();
	}

	@Then("Verif the Message is Sent")
	public void verif_the_message_is_sent() {
	    String msg="Message sent";
	    String actualText=driver.findElement(By.xpath("//span[text()='Message sent']")).getText();
	    
	    Assert.assertEquals("Message sent", actualText);
		
		
	}

*/	
	
	
	

}
