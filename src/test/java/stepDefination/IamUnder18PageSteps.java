package stepDefination;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.GooglePage;

public class IamUnder18PageSteps extends Base {
	GooglePage google=new GooglePage();
	//WebDriver driver;

	//@Given("Accept cookies pop up")
	//public void accept_cookies_pop_up() {
	//	google.accept_cookies_pop_up();
	//}
	
	@And("Click to I am under {int} pop up")
	public void click_to_i_am_under_pop_up(Integer int1) {
		google.click_to_i_am_under_pop_up(int1);
	}

	@Then("Go to google home page and verify")
	public void go_to_google_home_page_and_verify() {
		google.go_to_google_home_page_and_verify();
		
	}
	}


