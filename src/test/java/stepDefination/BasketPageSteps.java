package stepDefination;

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
import page.BasketPage;

public class BasketPageSteps extends Base{
	BasketPage basket=new BasketPage();
	//WebDriver driver;
	
	
	//@Given("Accept cookies pop--up")
	//public void accept_cookies_pop_up() {
	//	basket.accept_cookies_pop_up();
	   
	//}

	//@When("Accept I am {int} pop--up")
	//public void accept_i_am_pop_up(Integer int1) {
	//	basket.accept_i_am_pop_up(int1);
	//}

	@When("Go to home page and search--product")
	public void go_to_home_page_and_search_product() {
		basket.go_to_home_page_and_search_product();
	}

	@When("Click product and go to -PDP")
	public void click_product_and_go_to_pdp() {
		basket.click_product_and_go_to_pdp();
	}

	@And("Add to basket product from -PDP and verify")
	public void add_to_basket_product_from_pdp_and_verify() {
		basket.add_to_basket_product_from_pdp_and_verify();
	    
	}


	@Then("Delete added product from basket and verify")
	public void delete_added_product_from_basket_and_verify() {
		basket.delete_added_product_from_basket_and_verify();
}
	}

	
	


