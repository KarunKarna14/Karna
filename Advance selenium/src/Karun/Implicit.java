package Karun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("Karna");
        driver.findElement(By.id("pass")).sendKeys("Karna@143");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        driver.close();
	}
}
