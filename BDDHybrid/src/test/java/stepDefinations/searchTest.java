package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactoryTest;
import io.cucumber.java.en.*;

public class searchTest {
	WebDriver driver;

	@Given("User open the application")
	public void user_open_the_application() {
		driver = DriverFactoryTest.getDriver();

	}

	@When("User enter valid product {string} into search box")
	public void user_enter_valid_product_into_search_box(String validProductName) {

		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys(validProductName);

	}

	@When("User enter invalid product {string} into search box")
	public void user_enter_invalid_product_into_search_box(String InvalidProductName) {

		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys(InvalidProductName);

	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

	}

	@Then("User should get valid products displayed on screen")
	public void user_should_get_valid_products_displayed_on_screen() {

		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	}

	@Then("User should get message about no product matching")
	public void user_should_get_message_about_no_product_matching() {
		Assert.assertEquals("There is no product that matches the search criteria.",
				driver.findElement(By.xpath("//input[@id='button-search']/following-sibling::p")).getText());

	}

	@When("User does not enter anything into search box")
	public void user_does_not_enter_anything_into_search_box() {


	}

}
