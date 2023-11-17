import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) 
	
	{
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	
	//Drag and Drop
	
	WebElement src = driver.findElement(By.id("credit"));
	
	WebElement tar = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
	
	Actions act = new Actions(driver);
	
	act.dragAndDrop(src, tar);
	
	
		

	}

}
