package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M4Register {

	public static void main(String[] args) throws InterruptedException {
		// register your self in Gmail.
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravina J Dholiya\\Desktop\\10nov\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("radhi patel");
        driver.findElement(By.name("password")).sendKeys("radhi123");
        driver.findElement(By.id("loginTrigger")).click();
        driver.close();
        

	}

}
