package firstmaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	
	{
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	WebDriverWait var = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	var.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))).sendKeys("Admin");
	
	var.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']"))).sendKeys("admin123");
	
	
	
	
	
	
	}

}
