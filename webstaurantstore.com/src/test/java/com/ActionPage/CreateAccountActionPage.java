package com.ActionPage;

import com.LocetorePage.CreateAccountLocetore;
import com.UitilityBased.Base_Class;

public class CreateAccountActionPage extends Base_Class {
	
CreateAccountLocetore AccountLocetore = new CreateAccountLocetore();
	
        public void click_login_to_your_account_from_manu_bar() {
        	AccountLocetore.ClickAccountlink.click();
	}
        public void click_on_the_Create_an_Account_button() {
        	AccountLocetore.CreateAccountButton.click();	
        }
        public void write_email_in_the_Email_text_field(String email) {
        	AccountLocetore.SendEmail.sendKeys(email);	
        }
     
        public void Name (String FullName) {
        	AccountLocetore.Fullname.sendKeys(FullName);	
        }
        public void company_name(String Company) {
        	AccountLocetore.CompanyName.sendKeys(Company);
        }
        public void drop_down_bar() {
        	AccountLocetore.ClickCompanyType.click();
        	
        }
        public void Click_ChooseCompanyType() {
        	AccountLocetore.ChooseCompany.click();
        }
        		
        public void write_home_Address(String Address) {
        	AccountLocetore.Address1.sendKeys(Address);		
        }
        
        public void write_Address_in_Address_Line(String Address2) {
        	AccountLocetore.Address2.sendKeys(Address2);
        }
        public void write_postal_code(String Code) {
        	AccountLocetore.Zipcode.sendKeys(Code);
        }
        public void write_PhoneNumber(String Phone) {
        	AccountLocetore.PhoneNo.sendKeys(Phone);
        }
        public void create_New_Password(String Pass) {
        	AccountLocetore.NewPassword.sendKeys(Pass);
        }
        public void click_create_My_Account_button() {
        	AccountLocetore.ClickRegistrationButton.click();
        }
        
        }

