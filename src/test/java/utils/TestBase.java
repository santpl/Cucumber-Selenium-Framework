package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String QAUrl = prop.getProperty("Url");
		if(driver==null) {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("Firefox"))
			{
				// "document.body.style.MozTransform = 'scale("+90%+")
			}
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			String zoomSize = "document.body.style.zoom = '90%'";
			driver.get(QAUrl);
			jse.executeScript(zoomSize);
		}
		return driver;
	}

}
