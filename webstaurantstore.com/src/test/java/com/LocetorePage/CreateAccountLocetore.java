package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.UitilityBased.Base_Class;

public class CreateAccountLocetore extends Base_Class {
	
		
		public CreateAccountLocetore() {
		   	 PageFactory.initElements(driver , this);
		    }
		
		
		             @FindBy(how = How.XPATH, using ="//a[@aria-label='login to your account']")
	                 public WebElement ClickAccountlink;
  
		             @FindBy(how = How.XPATH, using ="//a[@class='btn btn-info']")
			         public WebElement CreateAccountButton;
		             
		             @FindBy(how = How.ID, using ="email")
			         public WebElement SendEmail;
		             
		             @FindBy(how = How.NAME, using ="BillingAddressName")
			         public WebElement Fullname;
		             
		             @FindBy(how = How.ID, using ="billcompany")
			         public WebElement CompanyName;
		             
		             @FindBy(how = How.ID, using ="billcompany_type")
			         public WebElement ClickCompanyType;
		             
		             @FindBy(how = How.XPATH, using ="//option[@value='Home Use']")
			         public WebElement ChooseCompany;
		             
		             @FindBy(how = How.NAME, using ="BillingAddress")
			         public WebElement Address1;
		             
		             @FindBy(how = How.XPATH, using ="//*[@id=\"billaddr2\"]")
			         public WebElement Address2;
		             
		             @FindBy(how = How.NAME, using ="BillingAddressZipCode")
			         public WebElement Zipcode;
		             
		             @FindBy(how = How.ID, using ="billphone")
			         public WebElement PhoneNo;
		             
		             @FindBy(how = How.ID, using ="password")
			         public WebElement NewPassword;
		             
		             @FindBy(how = How.ID, using ="complete_registration")
			         public WebElement ClickRegistrationButton;
		             
		             
		             
		             
	}


