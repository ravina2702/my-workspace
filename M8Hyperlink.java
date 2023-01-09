package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class M8Hyperlink {

	public static void main(String[] args)throws InterruptedException {
		// total hyperlink from this web page
		WebDriver driver = DriverConnection.connect();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		String str[ ]= new  String[tags.size()];
		for(String s:str)
		{
			System.out.println(s);
			driver.findElement(By.linkText(s)).click();
			
			Thread.sleep(5000);
			driver.navigate().back();
		}
	}
}
		
		
		
		
		
		

	
	

