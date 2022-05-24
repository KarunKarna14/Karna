package Karun;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Generic 
{
@Test(priority = 1, invocationCount=5)
public void signup()
{
	System.out.println("Signup please");
}
@Test(priority=2, invocationCount=3)
public void login()
{
	
	System.out.println("Login");
}
@Test(priority=3, enabled=true)
public void BookaRide()
{
	System.out.println("Ride Booked");
}
}