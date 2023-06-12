package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;

public class BasketPage extends Base {
	
	
	
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
		searchProductElement.sendKeys("eLiquide Bottles");
		
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();
	    
	}
	public void click_product_and_go_to_pdp() {
		WebElement goToPdpElement=driver.findElement(By.xpath("(//a[@class='productCompactDetail-imageLink-2BC'])[6]"));
		goToPdpElement.click();

	   
	}
	public void add_to_basket_product_from_pdp_and_verify() {
		WebElement addToCardProductElement=driver.findElement(By.xpath("//section[@class='productFullDetail-cartActions-11b productFullDetail-section-gqQ']/button[1]/span[1]"));
		addToCardProductElement.click();
	    
	}
	public void delete_added_product_from_basket_and_verify() {
		WebElement goToBasketPagElement=driver.findElement(By.xpath("(//span[@class='icon-root-XQD'])[6]"));
		goToBasketPagElement.click();
		
		
	    WebElement deletProductElement=driver.findElement(By.xpath("//button[@class='item-deleteButton-3Eu']"));
	    
	    JavascriptExecutor er = (JavascriptExecutor)driver;
		er.executeScript("arguments[0].click();", deletProductElement);
	    
	WebElement verifyCardIsEmty=driver.findElement(By.xpath("(//button[@aria-label='Toggle mini cart. You have 0 items in your cart.'])[1]"));
	assertTrue(verifyCardIsEmty.isDisplayed());
	driver.quit();
}

public static void assertTrue(boolean displayed) {
// TODO Auto-generated method stub

}
}
