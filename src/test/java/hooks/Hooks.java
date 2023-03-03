package hooks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.PageContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	PageContext context;
	public Hooks(PageContext context) {
		this.context = context;
	}
	@SuppressWarnings("deprecation")
	@Before
	public void beforeScenario(Scenario scenario) {
		RemoteWebDriver driver = new ChromeDriver();
		context.setDriver(driver);
		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		context.setWait(wait);
		context.getDriver().get("https://bookcart.azurewebsites.net/");
//		context.getDriver().manage().window().maximize();
		// Implicit Wait
		context.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String name = scenario.getName();
		System.out.println("Scenario name: " + name);
	}

	@After("@Cleanup")
	public void CleanData(Scenario scenario) {
		// Before clear cart
		byte[] screenshotAs = context.getDriver().getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotAs, "image/png");
		context.getDriver().findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-icon-button')])[2]")).click();

//		driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[1]")).click();
		context.getDriver().findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-elevation-z4')])[1]")).click();
		String text = context.getDriver().findElement(By.tagName("mat-card-title")).getText();
		Assert.assertEquals(text, "Shopping cart is empty");
		// After Clear cart
		screenshotAs = context.getDriver().getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotAs, "image/png");
//		driver.quit();
	}

	@After
	public void AfterScenario(Scenario scenario) {
		boolean failed = scenario.isFailed();
		System.out.println("Is Failed: " + failed);

		// This is used to if Scenario will failed take the screenshot
		if (failed) {
			byte[] screenshotAs = context.getDriver().getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
		}
	
		context.getDriver().quit();
	}

}
