package stepDefe;

import com.ActionPage.LoginAction;
import com.UitilityBased.Base_Class;

import cucumber.api.java.en.Then;

public class LoginTestStep extends Base_Class {
	LoginAction loginAction = new LoginAction();
	
	@Then("^Click login to your account from manu bar$")
	public void click_login_to_your_account_from_manu_bar() throws Throwable {
		loginAction.click_login_to_your_account_from_manu_bar();
	}

	@Then("^User entered valid username$")
	public void user_entered_valid_username() throws Throwable {
	}

	@Then("^User entered valid password$")
	public void user_entered_valid_password() throws Throwable {
	}

	@Then("^Click in the Login button$")
	public void click_in_the_Login_button() throws Throwable {
	}

	@Then("^Click user account manu bar$")
	public void click_user_account_manu_bar() throws Throwable {
	}

	@Then("^Click Logout button$")
	public void click_Logout_button() throws Throwable {
	}

	@Then("^User entered invalid username$")
	public void user_entered_invalid_username() throws Throwable {
	}

	@Then("^User entered invalid password$")
	public void user_entered_invalid_password() throws Throwable {
	}
	
	
	

}
