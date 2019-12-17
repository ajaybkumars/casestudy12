package scenario1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newtest1 {
	static WebDriver driver;
	
	@Given("Enter the url")
	public void enter_the_url() {
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   Assert.assertEquals(driver.getTitle(),"Home");
	}

	@Given("click on signup linktext")
	public void click_on_signup_linktext() {
	   driver.findElement(By.linkText("SignUp")).click();
	}

	@Given("Enter the available username")
	public void enter_the_available_username() {
	   driver.findElement(By.name("userName")).sendKeys("newgooduser");
	}

	@Given("Enter the fist name")
	public void enter_the_fist_name() {
	    driver.findElement(By.name("firstName")).sendKeys("ZEN");
	}

	@Given("Enter the last name")
	public void enter_the_last_name() {
	  driver.findElement(By.name("lastName")).sendKeys("CLONE");
	}

	@Given("Enter the new password")
	public void enter_the_new_password() {
	    driver.findElement(By.name("password")).sendKeys("catchmeifyoucan");
	}

	@Given("Re-enter the new password")
	public void re_enter_the_new_password() {
	   driver.findElement(By.name("confirmPassword")).sendKeys("catchmeifyoucan");
	}

	@Then("Mark the gendre")
	public void mark_the_gendre() {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	    	}

	@Then("Enter the email address")
	public void enter_the_email_address() {
	    driver.findElement(By.name("emailAddress")).sendKeys("email@something.com");
	}

	@Then("Enter the Mobile number")
	public void enter_the_Mobile_number() {
		 driver.findElement(By.name("mobileNumber")).sendKeys("4646465464");
	}

	@Then("Input the DOB in formate")
	public void input_the_DOB_in_formate() {
		driver.findElement(By.name("DOB")).sendKeys("12/06/2001");
	}

	@Then("Enter the address")
	public void enter_the_address() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Select the desired security question")
	public void select_the_desired_security_question() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Enter the answer for question")
	public void enter_the_answer_for_question() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Click on Register button")
	public void click_on_Register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Display login page")
	public void display_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}



}
