package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.Base;

public class GooglePage extends Base {
	
	
	public void accept_cookies_pop_up() {
		WebElement acceptcookiesElement=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		acceptcookiesElement.click();
	}
	public void click_to_i_am_under_pop_up(Integer int1) {
		WebElement ImUnder18=driver.findElement(By.xpath("//div[@class='dialog-buttonWrap-3xa']/button[1]"));
		//ImUnder18.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ImUnder18);
	}
	public void go_to_google_home_page_and_verify() {
		WebElement waitForGooglElement=driver.findElement(By.xpath("//img[@alt='Google']"));
		assertTrue(waitForGooglElement.isDisplayed());
		driver.quit();
		
		}

  public static void assertTrue(boolean displayed) {
	// TODO Auto-generated method stub
	
  }	
  }		
	
	
	
	


