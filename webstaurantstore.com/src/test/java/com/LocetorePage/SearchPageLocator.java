package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.UitilityBased.Base_Class;

public class SearchPageLocator extends Base_Class {
	
	public SearchPageLocator() {
	   	 PageFactory.initElements(driver , this);
	    }
		
	             @FindBy(how = How.XPATH, using ="//input[ @id='searchval']")
		         public WebElement SeaechField;
	             
	             @FindBy(how = How.XPATH, using ="//button[ @value='Search']")
		         public WebElement SeaechButton;
	             
	             @FindBy(how = How.XPATH, using ="//a[@data-testid=\"itemDescription\"]")
		         public WebElement Text;
	             
	             @FindBy(how = How.XPATH, using ="//div[@data-item-number=\"600t3060g\"]")
		         public WebElement ClickAddItem;
	             
	             @FindBy(how = How.XPATH, using ="//input[@id=\"buyButton\"]")
		         public WebElement AddToCart;
	             
	             @FindBy(how = How.XPATH, using ="//span[@class=\"hidden xsl:inline\"]")
		         public WebElement ClickToCart;
	             
	             @FindBy(how = How.CLASS_NAME, using ="itemDelete__icon")
		         public WebElement EmptyCart;
	             
	            

}
