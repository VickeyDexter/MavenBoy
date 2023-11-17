import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickerrevision {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		//1]CAPTURE INPUT BOX
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//2]WE NEED TO ENTER MONTH DATE AND YEAR IN INPUT BOX
		
		String month = "May";
		String year = "2024";
		String date = "3";
		
		//3] MONTH & YEAR NOT FIXED SO WE ARE USING WHILE(TRUE)
		while(true)
		{
			String months = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String years = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
			if(months.equals(month) && years.equals(year))
				{
					break;
				}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		//4] FIND XPATH OF DATE 
		List<WebElement> dates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		//5] DATES ARE FIXED SO USING FOR LOOP
		for (WebElement x:dates)
		{
			String y =x.getText();
		
		if(y.equals(date))
		{
			x.click();
			break;
		}
		}
	
	}

}
