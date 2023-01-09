package module4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class M2Dropdown {

	public static void main(String[] args) {
		// Selecting multiple items in a drop dropdown
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravina J Dholiya\\Desktop\\10nov\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.name("firstname")).sendKeys("ravina");
        driver.findElement(By.name("lastname")).sendKeys("lathiya");
        
        List<WebElement>gender = driver.findElements(By.name("sex"));
        System.out.println(gender.size());
        gender.get(1).click();
        
        List<WebElement>experience = driver.findElements(By.name("exp"));
        experience.get(2).click();
        driver.findElement(By.id("datepicker")).sendKeys("27/02/1997");
        driver.findElement(By.id("profession-0")).click();
        driver.findElement(By.id("tool-2")).click();
        
        WebElement country = driver.findElement(By.id("continents"));
        Select countries = new Select(country);
        countries.selectByIndex(5);
        
        WebElement command = driver.findElement(By.id("Selenium Commands"));
        Select commands = new Select(command);
        commands.selectByVisibleText("Browser Commands");
        commands.selectByVisibleText("Wait Commands");
        driver.close();
        
        
        
        
        
        

	}

}
