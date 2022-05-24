package Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PomClass1 
{
	@FindBy(xpath="//input[@name ='username']")
	private WebElement Phone;
	
	@FindBy(xpath="//input[@name ='password']")
	private WebElement pass;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement lgn_btn;
	
	public PomClass1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username()
	{
		Phone.sendKeys("8722409817");
	}
	public void password()
	{
		pass.sendKeys("Karna@1234");
	}
	public void login()
	{
		lgn_btn.click();
	}

}
