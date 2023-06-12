package page;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PlpPage {
	WebDriver driver;
	
	
	
	public void accept_cookies_pop_up() {
		WebElement acceptcookiesElement=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		acceptcookiesElement.click();
	   
	}

	
	public void accept_i_am_pop_up(Integer int1) {
		
		WebElement Iam18=driver.findElement(By.xpath("//div[@class='dialog-buttonWrap-3xa']/button[2]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Iam18);
		
		
		
	  
	}

	
	public void go_to_home_page_and_search_product() {
		WebElement searchProductElement=driver.findElement(By.xpath("//input[@placeholder='Search for flavours and devices...']"));
		searchProductElement.sendKeys("Vuse go device");
		
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();
		
		
	  
	}

	
	public void go_to_plp_and_product_add_to_basket() {
	WebElement addToCardProductElement=driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/main/div[4]/article/section[1]/div/div/div[19]/form/section[2]/button/span"));
	addToCardProductElement.click();
	}
	
	
  



    public void check_product_add_or_not_in_basket() {
    	WebElement verifyProductAddOrNot=driver.findElement(By.xpath("//*[@id=\"header-navBar\"]/div/div[2]/div[4]/button/span[2]"));

		assertTrue(verifyProductAddOrNot.isDisplayed());
		driver.quit();
		

	
	
				}

	private static void assertTrue(boolean displayed) {
		// TODO Auto-generated method stub
		
	}
			
		
	    
	}
	
	
	
	
	
	
	


