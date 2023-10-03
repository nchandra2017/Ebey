package com.ActionPage;

import org.testng.Assert;

import com.LocetorePage.LoginLocetore;
import com.UitilityBased.Base_Class;

public class LoginAction extends Base_Class{
	
	LoginLocetore LoginLocetor = new LoginLocetore();
	public void click_login_to_your_account_from_manu_bar() {
		LoginLocetor.ClickAccountlink.click();
		
	}
	
	
	
	public void user_entered_valid_username(String Data ) {
    	LoginLocetor.InputUserId.sendKeys (property.getProperty(Data));
	}
	public void user_entered_valid_password(String Pass) {
		LoginLocetor.InputPassword.sendKeys(property.getProperty(Pass));
		
	}
	public void click_in_the_Login_button() {
		LoginLocetor.ClickLoginButton.click();
	}
	public void verify_user_login_successfull() {
		boolean showPage = LoginLocetor.VerifyLoginSuccess.isDisplayed();
		Assert.assertTrue(showPage);
	}
	public void click_user_account_manu_bar() {
		LoginLocetor.UsarAccountLinlk.click();
	}
	public void click_Logout_button() {
		LoginLocetor.ClickLogOut.click();
	}
	public void user_entered_invalid_username(String InvalidId) {
		LoginLocetor.InputUserId.sendKeys(property.getProperty(InvalidId));
	}
	public void verify_user_should_not_login_successfull() {
		boolean masspop = LoginLocetor.ErrorEmail.isDisplayed();
		Assert.assertTrue(masspop);
	}
	public void user_not_login_successfull() {
		boolean masspop = LoginLocetor.ErrorMassage.isDisplayed();
		Assert.assertTrue(masspop);
		
	}
	public void user_entered_invalid_password(String InvalidPass) {
		LoginLocetor.InputPassword.sendKeys(InvalidPass);
		
	}
	public void verify_user_not_login_successfull() {
		boolean masspopup = LoginLocetor.ErrorMassage.isDisplayed();
		Assert.assertTrue(masspopup);
		
	}
	public void verify_user_not_login() {
		boolean ermasspopup = LoginLocetor.ErrorEmail.isDisplayed();
		Assert.assertTrue(ermasspopup);
	}
}
