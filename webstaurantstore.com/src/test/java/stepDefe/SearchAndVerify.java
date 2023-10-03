package stepDefe;




import com.ActionPage.SearchPageAction;
import com.UitilityBased.Base_Class;

import cucumber.api.java.en.*;



public class SearchAndVerify extends Base_Class {
	
	SearchPageAction searchPageAction = new SearchPageAction();
	
	
	

	@Then("^Search for 'stainless work table'$")
	public void search_for_stainless_work_table() throws Throwable {
		searchPageAction.search_for_stainless_work_table(property.getProperty("product0"));
		
	}

	@When("^Check the search result ensuring every product item has the word 'Table' in its title$")
	public void check_the_search_result_ensuring_every_product_item_has_the_word_Table_in_its_title() throws Throwable {
		searchPageAction.check_the_search_result_ensuring_every_product_item_has_the_word_Table_in_its_title();
	    
	}

	@Then("^Add the last of found items to Cart$")
	public void add_the_last_of_found_items_to_Cart() throws Throwable {
		searchPageAction.add_the_last_of_found_items_to_Cart();
	   
	}

	@Then("^Empty Cart$")
	public void empty_Cart() throws Throwable {
		searchPageAction.empty_Cart(); 
	    
	}


}
