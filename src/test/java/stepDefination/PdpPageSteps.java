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
import io.github.bonigarcia.wdm.WebDriverManager;
import page.PdpPage;

public class PdpPageSteps extends Base {
	PdpPage pdp=new PdpPage();
	//WebDriver driver;
	
	
	

	@When("Go to home page and search-product")
	public void go_to_home_page_and_search_product() {
		pdp.go_to_home_page_and_search_product();
		
	}

	@When("Click product and go to PDP")
	public void click_product_and_go_to_pdp() {
		pdp.click_product_and_go_to_pdp();
		
	}
	//Vuse eLiquid Bottle Original Strawberry
	@And("Add to basket product from PDP")
	public void add_to_basket_product_from_pdp() {
		pdp.add_to_basket_product_from_pdp();
	}

	@Then("Verify product add or not in basket")
	public void vrify_product_add_or_not_in_basket() {
		pdp.vrify_product_add_or_not_in_basket();
	
	}
	//old is gold

}
