package module4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M6MouseKeyboard {

	public static void main(String[] args) throws InterruptedException {
		// 1. mouse 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravina J Dholiya\\Desktop\\10nov\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        
        WebElement sell = driver.findElement(By.linkText("Sell"));
        WebElement bs = driver.findElement(By.linkText("Best Sellers"));
        WebElement mobile = driver.findElement(By.linkText("Mobiles"));
        
        Actions builder = new Actions(driver);
        builder.moveToElement(sell).build().perform();
        builder.moveToElement(bs).build().perform();
        builder.moveToElement(mobile).build().perform();
        
       Thread.sleep(5000);
       driver.quit();
       
       
       
       //2.keyboard
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravina J Dholiya\\Desktop\\10nov\\chromedriver_win32 (1)\\chromedriver.exe");
       WebDriver driver1 = new ChromeDriver();
       driver1.manage().window().maximize();
       driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       driver1.get("https://www.google.com/");
       
       Actions builder1 = new Actions(driver);
       WebElement search = driver.findElement(By.name("q"));
		builder1.click(search)
                         .keyDown(Keys.SHIFT)
                         .sendKeys("optical ")
                         .keyUp(Keys.SHIFT)
                         .pause(Duration.ofSeconds(5))
                         .sendKeys(Keys.ARROW_DOWN)
                         .sendKeys(Keys.ENTER)
                         .build()
                         .perform();
       Thread.sleep(5000);
       driver1.quit();
       
       
       
       
       
       

	}

}
