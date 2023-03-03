package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.PageContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage  {
	
	PageContext context;
	public LoginPage(PageContext context) {
		this.context = context;
	}

	// Change the method as parameterized (Username and password)
	@Given("User enter the username as {string}")
	public void userEnterTheUsernameAs(String username) {
		context.getDriver().findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys(username);
	}

	@Given("User enter the password as {string}")
	public void userEnterThePasswordAs(String password) {
		context.getDriver().findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys(password);
	}

	@When("User click the login button")
	public void userClickTheLoginButton() {
		context.getDriver().findElement(By.cssSelector("button[color='primary']")).click();
	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() {
		WebElement userEle = context.getDriver()
				.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]//span[1]"));
		context.getWait().until(ExpectedConditions.visibilityOf(userEle));
//			context.getDriver().quit();
	}

	@Then("Login should fail")
	public void loginShouldFail() {
		String errorMsg = context.getDriver().findElement(By.cssSelector("mat-error[role='alert']")).getText();
		Assert.assertEquals(errorMsg, "Username or Password is incorrect.");
//			context.getDriver().quit();
	}
	
	@Given("User should login as {string} and {string}")
	public void userShouldLoginAsAnd(String user, String pass) {
	   this.userEnterTheUsernameAs(user);
	   this.userEnterThePasswordAs(pass);
	   this.userClickTheLoginButton();
	   this.userClickTheLoginButton();
	}

}
