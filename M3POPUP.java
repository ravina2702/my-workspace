package module4;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class M3POPUP {

	public static void main(String[] args) {
		// methods to manage the windows-alerts and pop ups
		//1.window alert
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravina J Dholiya\\Desktop\\10nov\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        driver.get("https://demoqa.com/alerts");
	        
	        //btn1
	        WebElement btn = driver.findElement(By.id("alertButton"));
	        btn.click();
	        Alert alert = driver.switchTo().alert();
	        System.out.println(alert.getText());
	        alert.accept();
	        
	      //btn2
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        WebElement btn2 = driver.findElement(By.id("timerAlertButton"));
	        btn2.click();
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert2 = driver.switchTo().alert();
	        System.out.println(alert2.getText());
	        alert2.accept();
	        
	        //btn3
	        WebElement btn3 = driver.findElement(By.id("confirmButton"));
	        btn3.click();
	        Alert alert3 = driver.switchTo().alert();
	         //alert3.accept();
	       alert3.dismiss();
	        
	        //btn4
	        WebElement btn4 = driver.findElement(By.id("promtButton"));
	        btn4.click();
	        Alert alert4 = driver.switchTo().alert();
	        alert4.sendKeys("welcome");
	        alert4.accept();
	       // alert4.dismiss();
	        driver.close();
	        
	        
	        //2.popup
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravina J Dholiya\\Desktop\\10nov\\chromedriver_win32 (1)\\chromedriver.exe");
	        WebDriver driver2 = new ChromeDriver();
	        driver2.manage().window().maximize();
	        driver2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        driver2.get("https://demo.guru99.com/popup.php");
	        
	        String mainWin = driver.getWindowHandle();
	        System.out.println(mainWin);
	        driver.findElement(By.linkText("Click Here")).click();
	        Set<String> allwins = driver.getWindowHandles();
	        for(String win : allwins)
	        {
	        	if(!win.equals(mainWin))
	        	{
	        		driver.switchTo().window(win);
	        	}
	        }
	        driver2.findElement(By.name("emailid")).sendKeys("ravina2702@gmail.com");
	        driver2.findElement(By.name("btnLogin")).click();
	        driver2.close();
	        driver2.switchTo().window(mainWin);
	        driver2.close();  //close single window
	}
}

	        
	        

	        
	        
		
		

	


