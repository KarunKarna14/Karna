package Karun;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestScript extends GenericClass
{
	@Test
	public void test()
	{
	PomClass pmc = new PomClass(driver);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
	pmc.username();
	pmc.password();
	pmc.login();
	}

}
