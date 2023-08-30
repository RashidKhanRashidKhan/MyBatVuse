package page;


import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Base;

public class RegistrationPage extends Base {

	// WebDriver driver;

	public void click_to_sign_in_button() {

		WebElement clicktosign = driver.findElement(By.xpath("//span[@class='accountChip-root-2kC']"));
		clicktosign.click();

	}

	public void click_to_i_am_new_here_button() {
		WebElement clicktonewuser = driver.findElement(By.xpath("//li[@class='signInSocial-tab-1vZ']"));
		clicktonewuser.click();

	}

	public void click_to_sign_up_with_email_button() {
		WebElement clicktosignup = driver.findElement(By.xpath("(//span[@class='button-content-3ns'])[1]"));
		clicktosignup.click();

	}

	public void fill_required_detais() {
		WebElement firstname = driver.findElement(By.xpath("//input[@name='customer.firstname']"));
		firstname.sendKeys("Rashid");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='customer.lastname']"));
		lastname.sendKeys("Khan");

		WebElement email = driver.findElement(By.xpath("//input[@autocomplete='email']"));
		email.sendKeys("Rashid123@gmail.com");

		WebElement dob = driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']"));
		dob.sendKeys("11/04/1999");

		WebElement manualyadd = driver.findElement(By.xpath("//div[@class='addressLookupToggle-root-3OY']/span[1]"));
		manualyadd.click();

		WebElement streetadd = driver.findElement(By.xpath("//input[@name='street[0]']"));
		streetadd.sendKeys("India, 58-59 North Street, SUDBURY, CO10 1RE, UNITED KINGDOM");

		WebElement Dob = driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']"));
		Dob.sendKeys("17/06/1998");

		WebElement cityadd = driver.findElement(By.xpath("//input[@name='city']"));
		cityadd.sendKeys("London");

		WebElement countyadd = driver.findElement(By.xpath("//input[@name='region[region]']"));
		countyadd.sendKeys("UK");

		WebElement postcod = driver.findElement(By.xpath("//input[@name='postcode']"));
		postcod.sendKeys("co10");

		WebElement phnumber = driver.findElement(By.xpath("//input[@name='telephone']"));

		phnumber.sendKeys("+447911123556");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Rashi@123");

		WebElement cunfirmpass = driver.findElement(By.xpath("//input[@name='password_confirm']"));
		cunfirmpass.sendKeys("Rashi@123");

		WebElement TandC = driver.findElement(By.xpath("(//span[@class='checkbox-switchToggle-3tC right'])[1]"));
		TandC.click();
		//Screenshott();
	}

	public void click_to_click_to_creat_your_account_button() {
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		// assertTrue(driver.findElement(By.xpath("//span[@class='errorMessage-errorMessage-3sE']")).isDisplayed());

		WebElement errrormasage = driver.findElement(By.xpath("//span[@class='errorMessage-errorMessage-3sE']"));
		validation(true, errrormasage);

		// driver.quit();
	}

}
