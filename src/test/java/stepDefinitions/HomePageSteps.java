package stepDefinitions;

import java.util.List;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utils.TestContextSetup;

public class HomePageSteps {

	
	
	public int total;
	public List<WebElement> productsCount;
	TestContextSetup testContextSetup;
	HomePage home;
	
	public HomePageSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		this.home = testContextSetup.pageObjectManager.getHomePage();
	}
	
	@Given("User on the Amazon.in homepage")
	public void user_on_the_amazon_in_homepage() {
		Assert.assertTrue(home.getTitle().contains("Online Shopping site"));
	}
	@When("User clicked on Fashion and then Mens header link")
	public void user_clicked_on_fashion_and_then_mens_header_link() {
		
		home.clickOnFashionLink();
		Assert.assertTrue(home.getTitle().contains("Amazon Fashion: Clothing"));
		home.clickOnMensLink();
		Assert.assertTrue(home.getTitle().contains("Men's clothing, watches,"));
	}
}
