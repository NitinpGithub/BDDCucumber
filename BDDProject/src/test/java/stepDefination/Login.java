package stepDefination;

import io.cucumber.java.en.*;

public class Login {
	
	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {
		System.out.println(">> Navigating URL");
	    
	}

	@When("user enter valid email address\"abc@gmail.com\"")
	public void user_enter_valid_email_address_abc_gmail_com() {
		System.out.println("Enter username");
	    
	}

	@When("enter valid password {string}")
	public void enter_valid_password(String string) {
	   System.out.println("enter password");
	}



	@When("click on login button")
	public void click_on_login_button() {
		System.out.println(">> Clicking Login Button");
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() {
		System.out.println(">> User is successfully login");
	}



}
