package Karun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		Thread.sleep(4000);
		ele.sendKeys("H:\\Users\\karun\\OneDrive\\Desktop\\Karna.html");
}
}