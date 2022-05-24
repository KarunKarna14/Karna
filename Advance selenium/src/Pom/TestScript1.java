package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Karun.PomClass;

public class TestScript1 extends GenericClass1
{
	@Test
	public void test()
	{
	PomClass1 pmc = new PomClass1(driver);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name ='username']"))));
	pmc.username();
	pmc.password();
	pmc.login();
	}

}
