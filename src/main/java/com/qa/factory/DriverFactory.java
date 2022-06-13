package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> ldriver = new ThreadLocal<>();
	
	public WebDriver initialize_driver(String browser)
	{
		
		System.out.println("Browser is "+ browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ldriver.set(new ChromeDriver());
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			ldriver.set(new FirefoxDriver());
			
		}
		else 
			System.out.println("Enter Correct Browser value");
getDriver().manage().deleteAllCookies();
getDriver().manage().window().maximize();
	return getDriver();
	}
	
	public static synchronized WebDriver getDriver()
	{
	
	return ldriver.get();
	}
	
}
