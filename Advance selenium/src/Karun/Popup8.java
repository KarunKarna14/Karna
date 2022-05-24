package Karun;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup8 
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
		//System.out.println(pid);
		Thread.sleep(2000);
		Set<String> allid = driver.getWindowHandles();
		int count = allid.size();
		System.out.println("Number of browser=" +count);
		for (String ids : allid) 
		{
			driver.switchTo().window(ids);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(2000);
		}
        driver.close();
}
}