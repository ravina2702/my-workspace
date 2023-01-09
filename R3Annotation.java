package module4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Driverconnection;

public class R3Annotation {
	
	//@before,@after,@Test


	static WebDriver driver;
	@Before
	public static void openbrower()
	{
		driver = Driverconnection.connect();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void titlecheck()
	{
		assertEquals("Facebook - log in or sign up", driver.getTitle());
	}
	@after
	public void logincheck()
	{
	driver.findElement(By.id("email")).sendKeys("tops");
	driver.findElement(By.id("pass")).sendKeys("tech123");
	driver.findElement(By.name("login")).click();
	
	}
	public static void close()
	{
		driver.quit();
	}







}
