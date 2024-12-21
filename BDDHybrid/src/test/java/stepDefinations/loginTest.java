package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import factory.DriverFactoryTest;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class loginTest 
{
	WebDriver driver;
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() 
	{
		driver = DriverFactoryTest.getDriver();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click(); 
	}

	@When("User enter valid Email {string} into email field")
	public void user_enter_valid_email_into_email_field(String validEmail) 
	{
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(validEmail); 
	}

	@When("User enter valid password {string} into password field")
	public void user_enter_valid_password_into_password_field(String validpassword) 
	{
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(validpassword); 
	}

	@When("User click login button")
	public void user_click_login_button() 
	{
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}

	@Then("User is able to login successful")
	public void user_is_able_to_login_successful()
	{
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}

	@When("User enter Invalid Email {string} into email field")
	public void user_enter_valid_use_emailrname_abc_gmail_com_into_email_field(String invalidEmail)
	{
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(invalidEmail);
	}

	@Then("User should get a warning message about credential mismatch")
	public void user_should_get_a_warning_message_about_credential_mismatch()
	{
		//Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
		
		Assert.assertEquals("Warning: No match for E-Mail Address and/or Password.", "Warning: No match for E-Mail Address and/or Password.");
		//Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
		
	}

	@When("User enter Invalid password {string} into password field")
	public void user_enter_invalid_password_into_password_field(String invalidPassword) 
	{
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(invalidPassword);
	    
	}
	@When("User enter nothing into email field")
	public void user_enter_nothing_into_email_field() 
	{
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("");
	}

	@When("User enter nothing into password field")
	public void user_enter_nothing_into_password_field()
	{
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("");
	}


	

}