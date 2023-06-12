package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {

	@Before
	public void setup() {
		// Write code here that turns the phrase above into concrete actions

		String Browsername = prop.getProperty("browser");
		if (Browsername.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		} else if (Browsername.equals("Firfox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--incognito");
			options.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver(options);
		} else if (Browsername.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--incognito");
			options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(options);

		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(13));

		WebElement acceptcokies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		acceptcokies.click();

		WebElement Iam18 = driver.findElement(By.xpath("//div[@class='dialog-buttonWrap-3xa']/button[2]"));
		try {
			Iam18.click();

		} catch (Exception e) {
			executorClick(Iam18);
		}

	}

	@After
	public void TearsDown(Scenario s) {
		if (s.isFailed()) {
			getScreenshot(s);
			// driver.quit();

		}
		driver.quit();
	}

}
