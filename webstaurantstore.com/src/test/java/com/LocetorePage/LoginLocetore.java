package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.UitilityBased.Base_Class;

public class LoginLocetore extends Base_Class{
	public LoginLocetore() {
	   	 PageFactory.initElements(driver , this);
	    }
	
	
		@FindBy(how = How.XPATH, using = "//a[@aria-label='login to your account']")
		public WebElement ClickAccountlink;
		

		@FindBy(how = How.XPATH, using = "//button[@data-testid='account-nav-button']")
		public WebElement UsarAccountLinlk;
		

		@FindBy(how = How.ID, using = "email")
		public WebElement InputUserId;
		
		@FindBy(how = How.ID, using = "password")
		public WebElement InputPassword;
		
		@FindBy(how = How.ID, using = "the_login_button")
		public WebElement ClickLoginButton; 

		@FindBy(how = How.LINK_TEXT, using = "Dashboard")
		public WebElement VerifyLoginSuccess;
		
		@FindBy(how = How.LINK_TEXT, using = "Logout")
		public WebElement ClickLogOut;
		
		@FindBy(how = How.XPATH, using = "//div[@class='alert alert-info']")
		public WebElement ErrorEmail;
				
		
		@FindBy(how = How.XPATH, using = "//div[@class='alert alert-danger']")
		public WebElement ErrorMassage;
		
		
}
