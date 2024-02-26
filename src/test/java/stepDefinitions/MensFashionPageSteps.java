package stepDefinitions;

import java.util.List;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.When;
import pageObjects.MensFashionPage;
import utils.TestContextSetup;

public class MensFashionPageSteps {
	public List<WebElement> productsCount;
	
	//int total;
	TestContextSetup testContextSetup;
	MensFashionPage mens;

	public MensFashionPageSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		this.mens = testContextSetup.pageObjectManager.getMensFashionPage();
		
	}
	
	@When("User filter by Average customer review of {int} stars and Up")
	public void user_filter_by_average_customer_review_of_stars_and_up(Integer int1) {
		mens.applyFilterAsFourStarAndAbove();
	}
	@When("User filter by price range {int}-{int}")
	public void user_filter_by_price_range(Integer int1, Integer int2) {
		mens.applyFilterAsPriceRange();
	}
	@When("User select Puma and Allen Solly in Brands")
	public void user_select_puma_and_allen_solly_in_brands() {
		mens.applyFilterAsBrand();
	}
	
	@When("I count the number of results on the first page and log the count to the console")
	public void i_count_the_number_of_results_on_the_first_page_and_log_the_count_to_the_console() {
		mens.printNumberOfProducts();
	}
	@When("I click on the second product")
	public void i_click_on_the_second_product() {
		mens.clickOnSecondProduct();
	}
	
}
