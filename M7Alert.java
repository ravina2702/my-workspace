package module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M7Alert {

	public static void main(String[] args) {
		// handled Alert in selenium
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravina J Dholiya\\Desktop\\10nov\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        
         driver.findElement(By.name("cusid")).sendKeys("2702");
         driver.findElement(By.name("submit")).click();
         Alert alert = driver.switchTo().alert();
         alert.accept();
         alert.accept();
         driver.close();
	}
	}
		
		

	


