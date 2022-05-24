package Karun;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://122.166.192.191:9004");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahul@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='/en/admin/customer/']")).click();
		driver.findElement(By.xpath("//a[@href='/en/admin/customer/create']")).click();
		driver.findElement(By.xpath("//input[@id='customer_edit_form_name']")).sendKeys("Harsha");
		driver.findElement(By.xpath("//textarea[@id='customer_edit_form_comment']")).sendKeys("One of the famous buiseness man in Asia");
		driver.findElement(By.xpath("//textarea[@id='customer_edit_form_address']")).sendKeys("Chikkamagaluru");
		driver.findElement(By.xpath("//input[@id='customer_edit_form_company']")).sendKeys("Harvi Infotech Pvt Ltd");	
		driver.close();
	}
}
