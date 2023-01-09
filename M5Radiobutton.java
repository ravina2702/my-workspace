package module4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class M5Radiobutton {

	public static void main(String[] args) {
		// perform the radio button to select one by one in loop
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravina J Dholiya\\Desktop\\10nov\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
        Select radios = new Select(radio1);
        radio1.click();
        radio2.click();
        radio3.click();
        
        WebElement checkbox1= driver.findElement(By.id("vfb-6-0"));
        WebElement checkbox2= driver.findElement(By.id("vfb-6-1"));
        WebElement checkbox3= driver.findElement(By.id("vfb-6-2"));
        Select checkboxs = new Select(checkbox1);
        checkbox1.click();
         checkbox2.click();
        checkbox3.click();
        
        
        
        
	}

}
