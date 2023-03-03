package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;
 
@CucumberOptions(
		features = {"src/test/java/Features/addToCart.feature"},
//		dryRun = true,
		glue = {"steps","hooks","pages"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

//		plugin = {"html:Reports"}
		// if you want particular scenario use "tags"
//		tags = "@dev"
		)


public class CartTestRunner extends AbstractTestNGCucumberTests{

}
