package BDDPKGSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("I am at login page")
	public void precondition()
	{
		System.out.println("Given statement specific method");
	}
	@When("I enter username")
public void enterUserName()
{
	
	System.out.println("I enter username");
	}
	@When("I enter password")
	public void enterPassword()
	
	{
		System.out.println("I enter password");

	}
@When("I click login button")
public void clickLoginButton() {
	System.out.println("Logged in to app");

	
}
@Then("I should get logged into application")
public void enteringApplication() {
	System.out.println("Logged in to application");

}
}


