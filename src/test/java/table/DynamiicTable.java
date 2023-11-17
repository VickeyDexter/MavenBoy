package table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamiicTable {

	public static void main(String[] args) {
		
		//DRIVER INSTANCE
		ChromeDriver driver = new ChromeDriver();
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//URL
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
	
		//X-PATH OF USERNAME
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		//X-PATH OF PASSWORD
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		//X-PATH OF LOGIN
		WebElement loginn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginn.click();
		
		//WARNING WINDOW CLOSE
		WebElement close =driver.findElement(By.xpath("//button[@class='btn-close']"));
		
		
		if(close.isDisplayed())
		{
			close.click();	
		}
		
		//NAVIGATE TO CUSTOMERS SECTION ; FIND ITS XPATH
		WebElement customer = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]"));
		customer.click();
		
		//DROPDOWN CUSTOMER X-PATH
		WebElement dropdowncustomer =driver.findElement(By.xpath("//ul[@class='collapse show']//a[contains(text(),'Customers')]"));
		dropdowncustomer.click();
		
        //FINDING X-PATH OF THE PAGINATION SECTION
		driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")); 
		//WE NEED TO GET TEXT FROM PAGINATION SECTION
		String pagination =driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(pagination); // OUTPUT : Showing 1 to 10 of 15416 (1542 Pages)
		
		
		//WE WANT TO GET THE STARTING & ENDING INDEX OF (1542 PAGES) WHICH IS DYNAMIC SO WE USE INDEXOF
		pagination.substring(pagination.indexOf("(")+1,pagination. indexOf("Pages")-1);  // TO GET INDEX OF 1 WE USE THE HELP OF "(" & ADDING +1 //TO GET THE INDEX OF 2 WE USE HELP
																								//OF PAGES AND SUBTRACTING -1
		
		//SUBSTRING RETURNS ONLY STRING VALUES , WE NEED TO CONVERT TO INTEGER TO PRINT THE OUTPUT
		Integer.parseInt(pagination.substring(pagination.indexOf("(")+1,pagination.indexOf("Pages")-1));
		
		int totalpages = Integer.parseInt(pagination.substring(pagination.indexOf("(")+1, pagination.indexOf("Pages")-1));
		
		System.out.println("Pagiination:"+totalpages);
		
		//HOW TO RETRIEVE ALL DATA FROM ALL PAGES?
		
			
		
		}
		
	    
		
		
	}

	
	

