package firstmaven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://practice.expandtesting.com/radio-buttons");
	
	/*WebElement var =driver.findElement(By.xpath("//input[@id='sunday']"));
	
	var.click();*/
	
	// SELECT MULTIPLE CHECK BOXES  //input[@class='form-check-input' and @type='checkbox']
	
	List<WebElement> chk=driver.findElements(By.xpath("//input[@type='radio' and @class='form-check-input']"));
	
	
	
	// SELECT MULTIPLE CHECK BOXES
	
	Thread.sleep(1000);
	
	for(WebElement x : chk)
	{
	x.click();
	
	}
	
	// TO FIND TOTAL NUMBER OF CHECKBOXES 
	// var.size();
	
	System.out.println("Total Elements are:"+  chk.size());
	
	
	} 
}
	


