package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.PageContext;
import cucumber.api.java.en.When;

public class HomePage {
	
	PageContext context;
	public HomePage(PageContext context) {
		this.context = context;
	}
	
	@When("User add the book to the cart")
	public void userAddTheBookToTheCart() {
		WebElement addToCart = context.getDriver().findElement(By.cssSelector("button[color='primary']"));
		WebElement addCart = context.getWait().until(ExpectedConditions.visibilityOf(addToCart));
		addCart.click();
	}

}
