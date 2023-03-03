//package steps;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.testng.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import drivers.DriverInstance;
//
//public class LoginSteps extends DriverInstance {
////	WebDriver driver;
////	WebDriverWait wait;
//
////	@SuppressWarnings("deprecation")//
////	@Given("User should navigate to the application login")
////	public void userShouldNavigateToTheApplication() {
////		driver = new ChromeDriver();
////		driver.get("https://bookcart.azurewebsites.net/");
////		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////		driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////	}
//
//	@Given("User clicks on the login link")
//	public void userClicksOnTheLoginLink() {
//		driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-button')])[2]")).click();
//	}
//
//	/*
//	 * // Move the methods as pass the parameter
//	 * 
//	 * @Given("User enter the username as ortoni") public void
//	 * userEnterTheUsernameAsOrtoni() {
//	 * driver.findElement(By.cssSelector("input[formcontrolname='username']")).
//	 * sendKeys("ortoni"); }
//	 * 
//	 * @Given("User enter the password as pass1234") public void
//	 * userEnterThePasswordAsPass() {
//	 * driver.findElement(By.cssSelector("input[formcontrolname='password']")).
//	 * sendKeys("pass1234"); }
//	 */
//
//	@When("User click the login button")
//	public void userClickTheLoginButton() {
//		driver.findElement(By.cssSelector("button[color='primary']")).click();
//	}
//
//	@Then("Login should be success")
//	public void loginShouldBeSuccess() {
//		WebElement userEle = driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]//span[1]"));
//		wait.until(ExpectedConditions.visibilityOf(userEle));
////		driver.quit();
//	}
//
//	/*
//	 * // Move the methods as pass the parameter
//	 * 
//	 * @Given("User enter the username as sankar") public void
//	 * userEnterTheUsernameAsSankar() {
//	 * driver.findElement(By.cssSelector("input[formcontrolname='username']")).
//	 * sendKeys("sankar"); }
//	 * 
//	 * @Given("User enter the password as pwd123") public void
//	 * userEnterThePasswordAsPwd() {
//	 * driver.findElement(By.cssSelector("input[formcontrolname='password']")).
//	 * sendKeys("pwd123"); }
//	 */
//
//	@Then("Login should fail")
//	public void loginShouldFail() {
//		String errorMsg = driver.findElement(By.cssSelector("mat-error[role='alert']")).getText();
//		Assert.assertEquals(errorMsg, "Username or Password is incorrect.");
////		driver.quit();
//	}
//
//	// Change the method as parameterized (Username and password)
//	@Given("User enter the username as {string}")
//	public void userEnterTheUsernameAs(String username) {
//		driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys(username);
//	}
//
//	@Given("User enter the password as {string}")
//	public void userEnterThePasswordAs(String password) {
//		driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys(password);
//	}
//
//}
