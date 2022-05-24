package Karun;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup3
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Karun");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		a1.accept();
		Thread.sleep(2000);
		Alert a2 = driver.switchTo().alert();
		a2.accept();
		Thread.sleep(2000);
		driver.close();
	}
}
