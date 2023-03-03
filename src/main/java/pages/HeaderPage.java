package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.PageContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HeaderPage{
	
	PageContext context;
	public HeaderPage(PageContext context) {
		this.context = context;
	}

	@Given("User clicks on the login link")
	public void userClicksOnTheLoginLink() {
		context.getDriver().findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-button')])[2]")).click();
	}

	@Given("User search a {string}")
	public void userSearchA(String book) {
		context.getDriver().findElement(By.cssSelector("input[type='search']")).sendKeys(book);
//		WebElement searchOptions = context.getDriver().findElement(By.cssSelector("span.mat-option-text"));
		WebElement searchOptions = context.getDriver().findElement(By.className("mat-option-text"));
		WebElement options = context.getWait().until(ExpectedConditions.visibilityOf(searchOptions));
		options.click();
	}

	@Then("The cart badge should be update")
	public void theCartBadgeShouldBeUpdate() {
		WebElement snackBar = context.getDriver().findElement(By.tagName("snack-bar-container"));
		context.getWait().until(ExpectedConditions.visibilityOf(snackBar));
		context.getWait().until(ExpectedConditions.invisibilityOf(snackBar));
		String text = context.getDriver().findElement(By.cssSelector("#mat-badge-content-0")).getText();
//		System.out.println("Number of books in Cart: " + text);
		Assert.assertEquals(Integer.parseInt(text) > 0, true);
//		context.getDriver().quit();
	}

}
