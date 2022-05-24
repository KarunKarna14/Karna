package Karun;

import org.apache.xml.security.Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass 
{
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement lgn_btn;
	
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username()
	{
		user.sendKeys("PomPom");
	}
	public void password()
	{
		pass.sendKeys("Bindu");
	}
	public void login()
	{
		lgn_btn.click();
	}
}

