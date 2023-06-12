package base;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	static {

		try {
			FileInputStream file = new FileInputStream("VuseData/VuseData.properties");
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// JavascriptExecutor executor = (JavascriptExecutor)driver;
	// executor.executeScript("arguments[0].click();", Iam18);

	public void JavaClick(WebElement element) {
		JavascriptExecutor ad = (JavascriptExecutor) driver;
		ad.executeScript("arguments[0].click();", element);
	}

	public void executorClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}

	public void waitforexpectedelement(WebElement ele, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public void waitforElementClickable(WebElement ele, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void validation(boolean b   , WebElement Ele) {
		assert (Ele.isDisplayed());
	}
	//validation( true /false    ,WebElement     );

	public void Screenshott() {
		TakesScreenshot TP= (TakesScreenshot) driver;
		File scrFile=TP.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Screenshot/" +"KingKhan"+""+System.currentTimeMillis()+ ".png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void getScreenshot(Scenario Scenario) {
		TakesScreenshot Ts = (TakesScreenshot) driver;
		File scrFile = Ts.getScreenshotAs(OutputType.FILE);
		String SenarioName = Scenario.getName();
		System.out.println(SenarioName);
		String ScreenShotName = SenarioName.replaceAll("[^a-zA-Z0-9]", "_");
		try {
			FileUtils.copyFile(scrFile, new File("Screenshot/" + ScreenShotName +""+System.currentTimeMillis()+ ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
