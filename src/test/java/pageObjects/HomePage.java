package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	public JavascriptExecutor jse;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		this.jse = (JavascriptExecutor) driver;
	}
	
	
	By Fashion = By.xpath("//a[text()='Fashion']");
	By Men = By.xpath("//div[@id='nav-subnav']//span[contains(text(), 'Men')]");
	

	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnFashionLink()
	{
		WebElement fashion = driver.findElement(Fashion);
		jse.executeScript("arguments[0].click();", fashion);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void clickOnMensLink()
	{
		driver.findElement(Men).click();
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
