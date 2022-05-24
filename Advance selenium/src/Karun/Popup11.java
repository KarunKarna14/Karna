package Karun;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup11 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(2000);
		String pid = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> allid = driver.getWindowHandles();
		for (String id : allid)
		{		
		driver.switchTo().window(id);
			if(pid.equals(id))
			{
				System.out.println("I am parent");
			}
			else
			{
				driver.close();
				Thread.sleep(2000);
			}

		}
	}

}
