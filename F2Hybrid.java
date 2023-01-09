package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ExcellReader;

public class F2Hybrid {
	
	//hybrid driven framework
	WebDriver driver;
	@Test(dataProvider = "dp")
	public void test(String function,String keyword,String locator, String location, String data)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(keyword.equals("browser"))
		{
			if(data.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravina J Dholiya\\Desktop\\10nov\\chromedriver_win32 (1)\\chromedriver.exe");
		         driver = new ChromeDriver();
			}
			else if (data.equals("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ravina J Dholiya\\Desktop\\10nov\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		        driver = new FirefoxDriver();
			}
		}
		else if(keyword.equals("url"))
		{
			driver.get(data);
		}
		else if(keyword.equals("type"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).sendKeys(data);
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).sendKeys(data);;
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).sendKeys(data);
			}
		}
		else if(keyword.equals("click"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).click();
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).click();
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).click();
			}
		}
		else if(keyword.equals("select"))
		{
			if(locator.equals("id"))
			{
				new Select(driver.findElement(By.id(location))).selectByVisibleText(data);
			}
			else if(locator.equals("name"))
			{
				new Select(driver.findElement(By.name(location))).selectByVisibleText(data);
			}
			else if(locator.equals("xpath"))
			{
				new Select(driver.findElement(By.xpath(location))).selectByVisibleText(data);
			}
		}
	}
	@DataProvider(name = "dp")
	public static Object[][] data()
	{
		ExcellReader ex = new ExcellReader( "C:\\Users\\Ravina J Dholiya\\Desktop\\tops\\mytest.xlsx","keyword");
		int row = ex.rowCount();
		int col = ex.colCount();
		
		Object obj[][] = new Object[row-1][col];
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = ex.getdata(i, j);
				obj[i-1][j] = data;
			}
		}
		return obj;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
	
	


