package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericClass1
{
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.instagram.com");
		wait = new WebDriverWait(driver, 10);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
