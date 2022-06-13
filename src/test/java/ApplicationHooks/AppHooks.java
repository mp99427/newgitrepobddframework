package ApplicationHooks;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.qa.factory.DriverFactory;
import com.qa.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AppHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() throws FileNotFoundException
	{
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	
	}
	@Before(order=1)
	public void launchBrowser()
	{
		String BrowserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.initialize_driver(BrowserName);
		
		}
	@After(order=0)
	public void quitDriver()
	{
		
		driver.quit();
	}
	@BeforeStep
	public void screenshot(Scenario scenario)
	{ 
		{String screenshotName = scenario.getName().replaceAll(" ","_");
		byte[] sourcepath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcepath, "image/png", screenshotName);
		}
	}

}
