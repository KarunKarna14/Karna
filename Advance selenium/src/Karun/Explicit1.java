package Karun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://facebook.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Facebook"));
		WebElement ele = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("karna");
		WebElement pass = driver.findElement(By.id("pass"));
        wait.until(ExpectedConditions.visibilityOf(pass));
        pass.sendKeys("karna@1234");
        driver.close();
	}

}
