package switchBrowserWindow;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowSwitch {

	public static void main(String[] args) {
		
		
		
		//DRIVER INSTANCE
		//DRIVER INSTANCE + MAXIMIZE
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				//IMPLICIT WAIT FOR SAFETY
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				//OPEN URL
				driver.get("https://testautomationpractice.blogspot.com/"); //LINK WORKING
				
				//FIND XPATH OF SEARCH TAB
				driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Testing");
				
				//FINDING XPATH OF SEARCH BUTTON
				driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
				
				//FINDING XPATH OF DROPDOWN ELEMENTS
				driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div/a"));
				
				List<WebElement> var = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div/a"));
				
				// FINDING SIZE OF DROPDOWN ELEMENTS
				var.size();
				System.out.println(var.size());
				
				// PRINTING ALL ELEMENTS BELOW DROPDOWN IN THE CONSOLE
				for(WebElement x:var)
				{
					x.getText();
					System.out.println(x.getText());
					
				}
				
				//GETTING MULTIPLE WINDOW HANDLES
				driver.getWindowHandles();
				Set<String> h = driver.getWindowHandles();
				
				//GETTING TITLE OF THE WINDOWS
				for(String y:h)
				{
					//SWITCHING DRIVER FROM DEFAULT WINDOW TO OTHER WINDOWS
					driver.switchTo().window(y).getTitle();
					String z = driver.switchTo().window(y).getTitle();
					
					System.out.println("Printing Title:"+z);
					
				}
				
				//OPENING ALL DROPDOWN LINKS BY GETTING THEIR XPATHS
				driver.findElement(By.xpath("//div/a[text()='Testing']")).click();
				driver.findElement(By.xpath("//div/a[text()='Testing cosmetics on animals']")).click();
				
				//GETTING THEIR WINDOW HANDLES
				driver.getWindowHandles();
				Set<String> a = driver.getWindowHandles();
				
				//SWITCHING DRIVER TO OTHER WINDOWS
				for(String x : a)
				{
					driver.switchTo().window(x).getTitle();
					String s = driver.switchTo().window(x).getTitle();
					System.out.println(s);
				
				// IF I WANT TO CLOSE , PARTICULAR WINDOW I CAN USE IF LOOP INSIDE FOR LOOP 
					if(s.equals("Testing cosmetics on animals - Wikipedia"))
							{
								driver.close();
							}
				}
				
				

	}

}
