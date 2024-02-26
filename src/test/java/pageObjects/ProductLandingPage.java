package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductLandingPage {
	public WebDriver driver;
	
	public ProductLandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By cartButton = By.cssSelector("#add-to-cart-button");
	By productMessage = By.xpath("//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']//h1");
	By cartValue = By.cssSelector("span#nav-cart-count");
	
	public void addProductToCart()
	{
		driver.findElement(cartButton).click();
		String productAdded = driver.findElement(productMessage).getText();
		System.out.println(productAdded);
	}
	
	public void verifyNumberOfItemsInCart()
	{
		String cartNumber = driver.findElement(cartValue).getText();
		Assert.assertEquals(cartNumber, "2");
		System.out.println("Product count: "+cartNumber);
	}

}
