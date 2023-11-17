package firstmaven;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Practice 
{




	public static void main(String[] args) 
	
	{
	ChromeDriver driver = new ChromeDriver();
	
	//IMPLICIT DECLARATION
	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    
    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
    
    Set<String> var = driver.getWindowHandles();
    
    for(String x:var)
    	
    {
    	System.out.println("Window ID is:"+var);
    }
	
	/*EXPLICIT DECLARATION
	
	WebDriverWait var = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	var.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin");
	
	var.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys("admin123");*/
	
	
	
	
	}
	
}

