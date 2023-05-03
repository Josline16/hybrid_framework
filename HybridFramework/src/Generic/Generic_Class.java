package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Class implements Framework_Constant {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(gecko_key, gecko_value);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		
	}
	@AfterMethod
	public void closeApp(ITestResult res)
	{
		if (ITestResult.FAILURE==res.getStatus()) 
		{
			Capture_ScreenShot.getScreenShot(driver);
		}
		driver.close();
	}	
	
}