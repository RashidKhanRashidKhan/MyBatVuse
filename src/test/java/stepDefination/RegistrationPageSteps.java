package stepDefination;

import static org.junit.Assert.assertTrue;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

//import java.time.Duration;


//import javax.security.auth.login.LoginContext;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.fasterxml.jackson.databind.Module.SetupContext;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;
import page.RegistrationPage;



public class RegistrationPageSteps extends Base {
	//WebDriver driver;
	
	
	RegistrationPage regist=new RegistrationPage();
	
	

	@When("Click to Sign In button")
	public void click_to_sign_in_button() {
		regist.click_to_sign_in_button();
		
	
	}

	@When("Click to I am new here button")
	public void click_to_i_am_new_here_button() {
		regist.click_to_i_am_new_here_button();
		
		}


	@When("Click to sign up with email button")
	public void click_to_sign_up_with_email_button() {
		regist.click_to_sign_up_with_email_button();
		
		
	}

	@And("Fill required detais")
	public void fill_required_detais() {
		regist.fill_required_detais();
		
	
		
	}

	@Then("Click to click to creat your account button")
	public void click_to_click_to_creat_your_account_button() {
		regist.click_to_click_to_creat_your_account_button();
		
		
   }

   }

		

	
	
	
	



