package table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getvaluefromtable {

	public static void main(String[] args) {

		//DRIVER INSTANCE
		
		ChromeDriver driver = new ChromeDriver();
		//IMPLICIT WAIT
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//MAXIMIZE URL
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1] VALIDATIONS : FIND TOTAL NO OF ROWS
		//WE CAN DIRECTLY FIND THE SIZE WITHOUT USING LIST<WEBELEMENT>
		
		driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println("Row Size is:" + row);
	
		
		//2] FIND TOTAL NO OF COLUMNS
		
		driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]/td"));
		
		int column = driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]/td")).size();
		
		System.out.println("Column Size is :"+ column);
		
		//3] FIND SPECIFIC ROW & COLUMN DATA
		//EG., CAPTURE ANIMESH
		
		driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[2]"));
		
		String s = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[2]")).getText();
		
		System.out.println("The Element is:"+s);
		
		
		//4] PRINT ALL DATA FROM ALL ROWS & COLUMNS
		// WE NEED 2 FOR LOOPS 1 FOR ROW AND 1 FOR COLUMN
		
		/*for(int r=2;r<=row;r++)
		{
			for(int c=1;c<=column;c++)
			{
				driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				String total = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				
				System.out.print(total+  "  ");
			}
			System.out.println("  ");
		}*/
		
		//5] PRINT BOOK NAMES WHOSE AUTHOR NAME IS AMIT
		
		for(int r=2 ; r<= row ; r++)
		{
			driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			System.out.println(author);
			
			if(author.equals("Amit"))
			{
				String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(book);
				System.out.println(author+ "  "+ book);
			}
		}
		
		//6] FIND SUM OF PRICES FOR ALL THE  
		int sum = 0;
		for(int r=2;r<=row ; r++)
		{
			String total = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			

			sum = sum +Integer.parseInt( total);
			
		}
		System.out.println(sum);
	}

}
