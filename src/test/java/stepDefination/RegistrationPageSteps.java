package stepDefination;


import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

		

	
	
	
	



