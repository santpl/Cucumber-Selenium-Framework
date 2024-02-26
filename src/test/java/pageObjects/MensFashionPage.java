package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MensFashionPage {
	
	public WebDriver driver;
	public JavascriptExecutor jse;
	public List<WebElement> overallProducts;
	int totalProducts;
	public MensFashionPage(WebDriver driver) {
		this.driver = driver;
		this.jse = (JavascriptExecutor) driver;
	}

	By customerReview = By.xpath("//span[contains(text(), 'Customer Review')]");
	By fourStarUp = By.cssSelector("div.a-section i.a-star-medium-4");
	By fourStartSelected = By.cssSelector("div.a-section i.a-star-medium-4");
	
	By price = By.xpath("//span[text()='Price']");
	By oneThousand = By.xpath("//span[contains(text(), '1,000 ')]");
	By oneKSelected = By.xpath("//span[@class='a-list-item']//span[contains(text(), '1,000 ')]");
	
	By pumaLabel = By.xpath("//li[contains(@aria-label, 'Puma')]//label/input[@type='checkbox']");
	By allenLabel = By.xpath("//li[contains(@aria-label, 'Allen Solly')]//label/input[@type='checkbox']");
	By allenBrandSelected = By.xpath("//li[contains(@aria-label, 'Allen Solly')]//label/input[@type='checkbox']");
	
	By products = By.xpath("//h2/a");
	
	public void applyFilterAsFourStarAndAbove()
	{
		try
		{
			WebElement avgReview = driver.findElement(customerReview);
			jse.executeScript("arguments[0].scrollIntoView();", avgReview);
			driver.findElement(fourStarUp).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			boolean result = driver.findElement(fourStartSelected).isEnabled();
			Assert.assertTrue(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void applyFilterAsPriceRange()
	{
		try {
			WebElement priceSection = driver.findElement(price);
			jse.executeScript("arguments[0].scrollIntoView();", priceSection);
			driver.findElement(oneThousand).click();
			boolean priceRes = driver.findElement(oneKSelected).isEnabled();
			Assert.assertTrue(priceRes);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void applyFilterAsBrand()
	{
		try {
			WebElement pumaCheckBox = driver.findElement(pumaLabel);
			jse.executeScript("arguments[0].click();", pumaCheckBox);
			WebElement allenCheckBox = driver.findElement(allenLabel);
			
			jse.executeScript("arguments[0].click();", allenCheckBox);
			boolean brand = driver.findElement(allenBrandSelected).isSelected();
			Assert.assertTrue(brand);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printNumberOfProducts()
	{
		overallProducts = driver.findElements(products);
		System.out.println("Number of products displayed in first page: "+overallProducts.size());
		Assert.assertEquals(overallProducts.size(), 48);
	}
	
	public void clickOnSecondProduct()
	{
		for(int i=0; i<overallProducts.size(); i++)
		{
			if(i==1) {
				overallProducts.get(i).click();
				System.out.println("Second product clicked...");
				break;
			}
		}
	}
}
