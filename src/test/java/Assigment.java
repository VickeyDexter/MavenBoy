import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("Portland");
		driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys("Buenos Aires");
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//1] FIND SMALLEST NUMBER FROM THE ARRAY
		double a[]= {472.56,432.98,200.98,765.32,233.98};
		
		Arrays.sort(a);
		
		System.out.println(a[0]);
		
		System.out.println("Smallest Number is :"+  "$"+a[0]);
		
		
		
		
		

	}

}
