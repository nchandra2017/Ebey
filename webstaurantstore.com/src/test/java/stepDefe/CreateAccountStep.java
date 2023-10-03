package stepDefe;

import com.ActionPage.CreateAccountActionPage;
import com.UitilityBased.Base_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateAccountStep extends Base_Class {

	CreateAccountActionPage CreateAccountAction = new CreateAccountActionPage();

	@Given("^Lanch webstaurantstore \"([^\"]*)\"$")
	public void lanch_webstaurantstore(String URL) throws Throwable {
		launchURL(URL);
	}

	@Then("^Click login to your account from manu bar$")
	public void click_login_to_your_account_from_manu_bar() throws Throwable {
		CreateAccountAction.click_login_to_your_account_from_manu_bar();
	}

	@Then("^Click on the Create an Account button$")
	public void click_on_the_Create_an_Account_button() throws Throwable {
		CreateAccountAction.click_on_the_Create_an_Account_button();
	}

	@Then("^Write email in the Email text field$")
	public void write_email_in_the_Email_text_field() throws Throwable {
		CreateAccountAction.write_email_in_the_Email_text_field(property.getProperty("EmailID"));
	}

	@Then("^Write name in the Name text field$")
	public void Name() throws Throwable {
		CreateAccountAction.Name(property.getProperty("FullName"));
	}

	@Then("^Write company in the Company text field$")
	public void companey_name() throws Throwable {
		CreateAccountAction.company_name(property.getProperty("company"));
	}

	@Then("^Click Choose company type drop down bar$")
	public void drop_down_bar() throws Throwable {
		CreateAccountAction.drop_down_bar();
	}

	@Then("^Click company name ChooseCompanyType$")
	public void Click_ChooseCompanyType() throws Throwable {
		CreateAccountAction.Click_ChooseCompanyType();
	}

	@Then("^Write home Address in the text field$")
	public void write_home_Address() throws Throwable {
		CreateAccountAction.write_home_Address(property.getProperty("Address1"));
	}

	@Then("^Write Address in Address Line$")
	public void write_Address_in_Address_Line() throws Throwable {
		CreateAccountAction.write_Address_in_Address_Line(property.getProperty("AddressLine2"));
	}

	
	@Then("^Write postal code in the text field$")
	public void write_postal_code() throws Throwable {
		CreateAccountAction.write_postal_code(property.getProperty("PostalCode"));
	}

	@Then("^Write PhoneNumber in the Phone text field$")
	public void write_PhoneNumber() throws Throwable {
		CreateAccountAction.write_PhoneNumber(property.getProperty("PhoneNumber"));
	}

	@Then("^Create New Password in the text field$")
	public void create_New_Password() throws Throwable {
		CreateAccountAction.create_New_Password(property.getProperty("Password"));
	}

	@Then("^click in the create My Account button$")
	public void click_create_My_Account_button() throws Throwable {
		CreateAccountAction.click_create_My_Account_button();
	}
	
	
}
