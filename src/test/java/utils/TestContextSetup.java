package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() {
		testBase = new TestBase();
		try {
			pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			genericUtils = new GenericUtils(testBase.WebDriverManager());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
