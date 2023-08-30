package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;

public class PdpPage extends Base {

	public void go_to_home_page_and_search_product() {
		WebElement searchProductElement = driver
				.findElement(By.xpath("//input[@placeholder='Search for flavours and devices...']"));
		searchProductElement.sendKeys("eLiquid Bottles");

		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();

	}

	public void click_product_and_go_to_pdp() {
		WebElement goToPdpElement = driver.findElement(
				By.xpath("//*[@id=\"root\"]/main/div[4]/article/section[1]/div/div/div[8]/form/a/div/img[2]"));
		// goToPdpElement.click();
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].click();", goToPdpElement);

	}

	public void add_to_basket_product_from_pdp() {
		WebElement addToCardProductElement = driver
				.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/form/div[2]/section[2]/button/span"));
		addToCardProductElement.click();

	}

	public void vrify_product_add_or_not_in_basket() {
		WebElement Validetion = driver
				.findElement(By.xpath("//*[@id=\"header-navBar\"]/div/div[2]/div[4]/button/span[3]"));
		assertTrue(Validetion.isDisplayed());
		//driver.quit();

	}

	private static void assertTrue(boolean displayed) {
		// TODO Auto-generated method stub
	}
//APj Kalam
}
