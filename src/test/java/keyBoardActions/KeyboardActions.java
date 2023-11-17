package keyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) 
	
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.text-compare.com/");
	//driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Text is Texting");
	
	//ACTIONS declaration
	/*Actions var = new Actions(driver);
	
	//KEYBOARD ACTIONS --> 1] ctrl+a ; 2] ctrl +c ; 3]tab ; 4] ctrl +v
	
	//1]ctrl+a
	var.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	
	
	//2]ctrl+c
	var.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	
	//3]TAB
	var.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	
	//4]ctrl+v
	var.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();*/
	
	driver.switchTo().newWindow(WindowType.TAB);
	
driver.get("https://www.google.com");
	driver.switchTo().newWindow(WindowType.WINDOW);
	
	driver.get("https://www.amazon.com");
	
	driver.switchTo().newWindow(WindowType.WINDOW);	
	

	}

}
