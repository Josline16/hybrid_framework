package Generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_ScreenShot 
{
	public static void getScreenShot(WebDriver driver)
			{
		try
		{
		String path="./Sreenshot/";
		Date d = new Date();
		String d1 = d.toString();
		String d2 = d1.replaceAll(":", "-");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File scr=tss.getScreenshotAs(OutputType.FILE);
		File dst=new File(path+d2+".png");
		FileHandler.copy(scr, dst);
		}
			catch (Exception e) {
				System.out.println(e);
			}
			}

}
