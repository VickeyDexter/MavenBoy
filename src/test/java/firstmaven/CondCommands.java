package firstmaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CondCommands {

	public static void main(String[] args) 
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.navigate().to("https://demo.nopcommerce.com/");
	    
	    driver.findElement(By.linkText("Log in")).click();
	    
	   WebElement var1 =  driver.findElement(By.xpath("//input[@type='checkbox']"));
	   
	   var1.click();
	   
	   System.out.println(var1.isSelected());
	   
	   driver.quit();
	    
	    
	    
	   
	 
	   
	   
	   
	   

	}

}
