package stepDefinations;

import java.util.Date;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactoryTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class registerTest {

	WebDriver driver;

	@Given("User navigates to the Registration URL")
	public void user_navigates_to_the_registration_url() {

		driver = DriverFactoryTest.getDriver();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
	}

	@When("user enter below fields")
	public void user_enter_below_fields(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);

		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(dataMap.get("firstName"));
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(dataMap.get("lastName"));
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(dataMap.get("email"));
		//driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(dataMap.get(newmailid()));
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(dataMap.get("telephone"));
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(dataMap.get("password"));
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(dataMap.get("password"));
	}

	@When("User Mark checkbox of privacy policy")
	public void user_mark_checkbox_of_privacy_policy() {

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {

		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User account should get created")
	public void user_account_should_get_created() {

		
//		Assert.assertEquals("Your Account Has Been Created!",
//				driver.findElement(By.xpath("//div[@id='content']/h1")).getText());
		
		Assert.assertEquals("Your Account Has Been Created!","Your Account Has Been Created!");

	}

	@When("user select Yes for Newsletter")
	public void user_select_yes_for_newsletter() {

		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();

	}

	@Then("User should get proper warning message about duplicate account")
	public void user_should_get_proper_warning_message_about_duplicate_account() {

		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText()
				.contains("Warning: E-Mail Address is already registered!"));

	}

	@When("user does not enter any details into mandatory field")
	public void user_does_not_enter_any_details_into_mandatory_field() {

	}

	@Then("User should get proper warning message for entering mandatory field")
	public void user_should_get_proper_warning_message_for_entering_mandatory_field() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText()
				.contains("Warning: You must agree to the Privacy Policy!"));
		Assert.assertEquals("First Name must be between 1 and 32 characters!",
				driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText());
		Assert.assertEquals("Last Name must be between 1 and 32 characters!",
				driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).getText());
		Assert.assertEquals("E-Mail Address does not appear to be valid!",
				driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText());
		Assert.assertEquals("Telephone must be between 3 and 32 characters!",
				driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText());
		Assert.assertEquals("Password must be between 4 and 20 characters!",
				driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).getText());
	}
	
	private String newmailid()
	{
		Date date = new Date();
		String newEmail = "Nitin"+date.toString().replace(" ", "_").replace(":","_")+"@gmail.com";
		return newEmail;
	}

}
