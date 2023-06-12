package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.PlpPage;

public class PlpPageSteps extends Base {
	PlpPage plp=new PlpPage();
	//WebDriver driver;
	
	
	//@Given("Accept cookies pop up")
	//public void accept_cookies_pop_up() {
		//plp.accept_cookies_pop_up();
	   
	//}

	//@When("Accept I am {int} pop up")
	//public void accept_i_am_pop_up(Integer int1) {
		//plp.accept_i_am_pop_up(int1);
	  
	//}

	@When("Go to home page and search product")
	public void go_to_home_page_and_search_product() {
		plp.go_to_home_page_and_search_product();
	  
	}
	//Vuse ePod and Vuse GO Blueberry Ice Bundle
	@And("Go to PLP and product add to basket")
	public void go_to_plp_and_product_add_to_basket() {
		plp.go_to_plp_and_product_add_to_basket();
	  
	}

	@Then("check product add or not in basket")
	public void check_product_add_or_not_in_basket() {
		plp.check_product_add_or_not_in_basket(); 
			

		
		
					}

		//private static void assertTrue(boolean displayed) {
			// TODO Auto-generated method stub
			
		//}
}
	
				
	
	

