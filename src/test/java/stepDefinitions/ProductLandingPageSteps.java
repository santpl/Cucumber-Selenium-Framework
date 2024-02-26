package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProductLandingPage;
import utils.TestContextSetup;

public class ProductLandingPageSteps {

	TestContextSetup testContextSetup;
	ProductLandingPage PLP;
	public ProductLandingPageSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		this.PLP = testContextSetup.pageObjectManager.getProductPage();
	}

	@When("I add it to the cart")
	public void i_add_it_to_the_cart() {
		switchToPLP();
		PLP.addProductToCart();
		
	}
	public void switchToPLP()
	{
		testContextSetup.genericUtils.switchWindowToChild();
	}
	@Then("I validate that no of items in cart is increased by {int}")
	public void i_validate_that_no_of_items_in_cart_is_increased_by(Integer int1) {
		PLP.verifyNumberOfItemsInCart();
	}
}
