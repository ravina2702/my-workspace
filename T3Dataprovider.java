package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Driverconnection;

public class T3Dataprovider {
//program to create dataprovider
	static WebDriver driver;
	@BeforeClass
	public static void openbrower()
	{
		driver = Driverconnection.connect();
		driver.get("https://www.facebook.com/");
	}
	@Test(dataProvider = "dp")
	public void logintest(String email,String pass)
	{
		WebElement username = driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(email);
		WebElement password = driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
		
	}
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
		
		
	
	
	
	
	
	

