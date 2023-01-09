package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class M1Linkedandpartial {

	public static void main(String[] args)throws InterruptedException {
		// Locating links by linkText() and partialLinkText()
		WebDriver driver = DriverConnection.connect();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		String str[ ]= new  String[tags.size()];
		//linked
		for(String s:str)
		{
			System.out.println(s);
			driver.findElement(By.linkText(s)).click();
			
			Thread.sleep(5000);
			driver.navigate().back();
		}
			//partial
		List< WebElement> links = driver.findElements(By.partialLinkText("Create"));
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
links.get(0).click();
	}
}


			
		


	


