package stepDefination;

import io.cucumber.java.en.*;

public class Register {

	@Given("user navigate to Register page")
	public void user_navigate_to_register_page() {
		System.out.println(">> Nagivation Registr page");
	}

	@When("user enter valid email  {string}")
	public void user_enter_valid_email(String string) {
		System.out.println(">> email");
	}

	@When("enter  password {string}")
	public void enter_password(String string) {
		System.out.println(">> password");
	}

	@When("click login button")
	public void click_login_button() {
		System.out.println(">> Clicking login button");
	}

	@Then("user should Register successfully")
	public void user_should_register_successfully() {
		System.out.println("Successful Register");
	}

}
