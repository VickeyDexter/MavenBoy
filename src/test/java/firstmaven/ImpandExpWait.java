package firstmaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpandExpWait {

	public static void main(String[] args) 
	
	{
	/*IMPLICIT WAIT
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");*/
	
	//EXPLICITLY WAIT - CONDITIONS
		
		ChromeDriver driver = new ChromeDriver();
		
		//EXPLICIT WAIT DECLARATION
		
		WebDriverWait var = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		var.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin");
		
		var.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys("admin123");
		
		
		
		
		
		
	
	
	
	

	}

	private static Object navigate() {
		// TODO Auto-generated method stub
		return null;
	}

}
