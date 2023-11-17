import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
		WebElement ele1 = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	
		
		Actions var = new Actions(driver);
		
		//1] CLICK AN ELEMENT
		var.moveToElement(ele1).click().perform();*/

		//var.contextClick().perform();
		
		/*driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
	WebElement rtclick =	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		
		//2] RIGHT CLICK AN ELEMENT 
		act.contextClick(rtclick).perform();*/
		
		//3] DOUBLE CLICK AN ELEMENT
		/*driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement text1 = driver.findElement(By.xpath("//input[@id='field1']"));
		
		text1.clear();
		text1.sendKeys("Hey There!");
		String s1 =text1.getText();
		
		WebElement text2 = driver.findElement(By.xpath("//input[@id='field2']"));
		String s2 = text2.getAttribute("value");
		
		
		
		WebElement text3 = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act = new Actions(driver);
		
		//4] DOUBLE CLICK
		act.doubleClick(text3).perform();
		
		if(s1.equals(s2))
		{
			System.out.println("Test is Passed");
			
		}
		else
		{
			System.out.println("Test is Failed");
		}*/
		
		//5] DRAG & DROP
		/*driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source =driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='box103']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).perform();*/
		
		//6 ACTIONS & ACTION CLASSES :
		
		/*WebElement source =driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='box103']"));
		
		Actions act = new Actions(driver);
		Action var = act.dragAndDrop(source, target).build(); // Action class has only build ; it is used just to store 
		var.perform();*/
		
		//7] SLIDER - DRAG & DROP BY
		/*driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement var = driver.findElement(By.xpath("//span[1]"));
		System.out.println("Default Location"+var.getLocation()); //59,250
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(var, 150, 0).perform();
		System.out.println("After Changing x location :"+var.getLocation());
		
		
		WebElement var1 = driver.findElement(By.xpath("//span[2]")); 
		System.out.println("Default Location of Slider 2 :"+var1.getLocation()); //412,250
		
		act.dragAndDropBy(var1, -110, 0).perform();
		
		System.out.println("value after changing:"+var.getLocation());*/
		
		//8] GETTING ELEMENT LOCATION AND SETTING UP WINDOW SIZE MANUALLY USING POINT CLASS
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		WebElement var = driver.findElement(By.xpath("//span[1]"));
		System.out.println("Default Location"+var.getLocation()); //59,250
		
		driver.manage().window().minimize();
		
		WebElement var1 = driver.findElement(By.xpath("//span[1]"));
		System.out.println(" Location after Minimizing"+var1.getLocation()); //59,250
		
		driver.manage().window().fullscreen();
		
		WebElement var2 = driver.findElement(By.xpath("//span[1]"));
		System.out.println(" Location after fullscreen"+var2.getLocation()); //59,250
		
		
		//we can set window size as fixed using Point class
		Point p = new Point(100, 250);
		driver.manage().window().setPosition(p);
		
		System.out.println(var.getLocation());
		
		
		
		
		
		
		
		
		
		
		
	}

}
