package switchBrowserWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//CONCEPT ?
		
		//LINK HAS 2 WINDOWS 
		//BY DEFAULT DRIVER FOCUS ONLY ON THE ONE BROWSER
		//FIRST WE NEED TO GET WINDOW IDS OF BROWSER WINDOWS USING GETWINDOWHANDLES
		//GETWINDOWHANDLES IS RETURNED BY SET<> COLLECTION
		//SET COLLECTION IS RETURNED ONLY BY LOOPS AS IT DID NOT SUPPORT INDEX AND GET METHODS
		//CONVERT SET COLLECTION TO LIST COLLECTION
		//GET 2 WINDOW IDS AS LIST FOLLOWS INDEX ; WINDOW ID1 IS 0 INDEX AND WINDOW ID2 IS 1 INDEX
		//SWITCH TO 2ND VIDEO USING 2ND WINDOW VARIABLE I.E, DRIVER.SWITCHTO().WINDOW(2ND WINDOW VARIABLE)
		
		//DRIVER INSTANCE + MAXIMIZE
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//IMPLICIT WAIT FOR SAFETY
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//OPEN URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //LINK WORKING
		
		//WINDOW 1 NAVIGATION LINK X-PATH
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		//CAPTURE BROWSER ID'S OF 2 WINDOWS
		driver.getWindowHandles();
		
		//RETURN TYPE OF GETWINDOWHANDLES IS SET COLLECTION METHOD
		Set<String> var = driver.getWindowHandles();
		
		//CONVERTING SET COLLECTION TO LIST COLLECTION
		List<String> listvar = new ArrayList(var); // NOW LIST HAS SET COLLECTION METHOD
		
		//WE CAN RETURN WINDOW HANDLES OF BOTH WINDOWS USING GET METHOD BY LIST COLLECTION WITH THE HELP OF INDEX
		listvar.get(0); //RETURNS 1ST WINDOW ID
		listvar.get(1); //RETURNS 2ND WINDOW ID
	
		
		//DRIVER NEEDS TO BE SWITCHED TO 2ND WINDOW 
		driver.switchTo().window(listvar.get(1));
		//GET ELEMENT FROM 2ND WINDOW
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		
		//TO COME BACK TO 1ST ELEMENT
		driver.switchTo().window(listvar.get(0));
		
		//METHOD 2 : USING LOOP FOR SET METHOD AND NOT USING LIST METHOD
		for(String x: var) //SET VARIABLE IS VAR WHICH HAS WINDOW HANDLES
		{
			driver.switchTo().window(x).getTitle();
			

			String title = driver.switchTo().window(x).getTitle();
			
			if(title.equals(""))
			{
				driver.findElement(By.xpath("")).click();
			}
		}

	}

}
