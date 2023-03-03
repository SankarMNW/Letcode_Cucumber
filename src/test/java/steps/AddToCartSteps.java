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
//public class AddToCartSteps extends DriverInstance {
////	WebDriver driver;
////	WebDriverWait wait;
//
//	// These step are used in hooks
////	@SuppressWarnings("deprecation")
////	@Given("User should navigate to the application")
////	public void userShouldNavigateToTheApplication() {
////		driver = new ChromeDriver();
////		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////		driver.get("https://bookcart.azurewebsites.net/");
////		driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////	}
//
//	@Given("User should login as {string} and {string}")
//	public void userShouldLoginAsAnd(String username, String password) {
//		driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-button')])[2]")).click();
//		driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys(username);
//		driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys(password);
//		driver.findElement(By.cssSelector("button[color='primary']")).click();
//		WebElement userEle = driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]//span[1]"));
//		wait.until(ExpectedConditions.visibilityOf(userEle));
//	}
//
//	@Given("User search a {string}")
//	public void userSearchA(String book) {
//		driver.findElement(By.cssSelector("input[type='search']")).sendKeys(book);
//		WebElement searchOptions = driver.findElement(By.cssSelector("span.mat-option-text"));
//		WebElement options = wait.until(ExpectedConditions.visibilityOf(searchOptions));
//		options.click();
//	}
//
//	@When("User add the book to the cart")
//	public void userAddTheBookToTheCart() {
//		WebElement addToCart = driver.findElement(By.cssSelector("button[color='primary']"));
//		WebElement addCart = wait.until(ExpectedConditions.visibilityOf(addToCart));
//		addCart.click();
//	}
//
//	@Then("The cart badge should be update")
//	public void theCartBadgeShouldBeUpdate() {
//		WebElement snackBar = driver.findElement(By.tagName("snack-bar-container"));
//		wait.until(ExpectedConditions.visibilityOf(snackBar));
//		wait.until(ExpectedConditions.invisibilityOf(snackBar));
//		String text = driver.findElement(By.cssSelector("#mat-badge-content-0")).getText();
//		System.out.println("Number of books in Cart: " + text);
//		Assert.assertEquals(Integer.parseInt(text) > 0, true);
////		driver.quit();
//	}
//
//}
