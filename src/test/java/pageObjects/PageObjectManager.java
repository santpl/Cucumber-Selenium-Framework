package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public HomePage homePage;
	public MensFashionPage mensFashionPage;
	public ProductLandingPage productPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage()
	{
		homePage = new HomePage(driver);
		return homePage;
		
	}
	
	public MensFashionPage getMensFashionPage()
	{
		mensFashionPage = new MensFashionPage(driver);
		return mensFashionPage;
	}
	
	public ProductLandingPage getProductPage()
	{
		productPage = new ProductLandingPage(driver);
		return productPage;
	}

}
