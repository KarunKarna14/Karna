package Karun;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup7 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		a1.sendKeys("Karun");
		Thread.sleep(2000);
		String text = a1.getText();
		System.out.println(text);
		a1.accept();
		Thread.sleep(2000);
		driver.close();
	}

}