import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownwithHiddenOptions {

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeDriver driver=new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);

		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[normalize-space()='PIM'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
	List<WebElement> hiddenelements =	driver.findElements(By.xpath("//div[@role='listbox']//span"));
	System.out.println(hiddenelements.size());
	
	for(WebElement x : hiddenelements)
	{
		String s =x.getText();
		System.out.println(s);
		
		if(s.equals("Sales Representative"))
		{
			x.click();
			break;
			
		}
		
	}
		
		
		
		
	}

}
