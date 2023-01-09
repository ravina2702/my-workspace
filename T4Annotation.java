package module4;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Driverconnection;

public class T4Annotation {
	//@beforetest,@aftertest,@Test
	
	@beforeTest
	public void titleCheck(ITestContext i)
	{
		WebDriver driver = Driverconnection.connect();
		driver.get("https://www.facebook.com/");
		i.setAttribute("myDriver", driver);
		assertEquals(driver.getTitle(), "Fb");
	}
		
	@Test
	public void login(ITestContext i)
	{
		WebDriver driver = Driverconnection.connect();
		driver.get("https://www.facebook.com/");
		i.setAttribute("myDriver", driver);
		
		
		driver.findElement(By.id("email")).sendKeys("ravina@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		assertEquals(driver.getTitle(), "Fb");
	}
	@AfterTest
	@DataProvider(name = "dp")
	public static Object[][]data()
	{
		Object obj[][] = new Object[3][2];
		obj[0][0]="tops@gmail.com";
		obj[0][1]="tops123";
		obj[1][0]="radhi@gmail.com";
		obj[1][1]="radhi123";
		obj[2][0]="ravina@gmail.com";
		obj[2][1]="ravina123";
		
		return obj;
}
}	
	
	
	
	
	
	


