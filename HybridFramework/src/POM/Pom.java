package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	//declaration
	@FindBy(id="email")
	private WebElement un;
	@FindBy(name="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement ele_btn;
	
	//initialization
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void username(String un1)
	{
		un.sendKeys(un1);
	}
	public void password(String pwd1)
	{
		pwd.sendKeys(pwd1);
	}
	public void login_btn()
	{
		ele_btn.click();
	}	
	}


