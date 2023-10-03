package com.ActionPage;

import com.LocetorePage.SearchPageLocator;

import com.UitilityBased.Base_Class;
import com.UitilityBased.Utiliti;

import junit.framework.Assert;

public class SearchPageAction extends Base_Class{
		
	
	SearchPageLocator searchLocator = new SearchPageLocator();
	
	public void search_for_stainless_work_table(String table) {
		searchLocator.SeaechField.sendKeys(table);
		searchLocator.SeaechButton.click();
		
	}
	
	public void check_the_search_result_ensuring_every_product_item_has_the_word_Table_in_its_title() {
		String title =driver.getTitle();
		Assert.assertTrue(title.contains("Table"));
	
		Utiliti.takescreenshot(driver, "Table");
	}
	public void add_the_last_of_found_items_to_Cart() {
		searchLocator.ClickAddItem.click();
		searchLocator.AddToCart.click();
		
		
	}
	public void empty_Cart() {
		
		searchLocator.ClickToCart.click();
		searchLocator.EmptyCart.click();
		
		
		
		
		
		
	}

}
