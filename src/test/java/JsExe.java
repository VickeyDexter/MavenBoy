import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class JsExe {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		/*JavascriptExecutor js = driver;
		
		//1] Inputbox - SendKeys Operation
		
		driver.findElement(By.id("name"));
		
		WebElement var = driver.findElement(By.id("name"));
		
		js.executeScript("arguments[0].setAttribute('value','hey')",var);
		
		//2] Click Operation using JavascriptExecutor
		
		WebElement clik = driver.findElement(By.name("gender"));
		
		js.executeScript("arguments[0].click();", clik);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		

		
		
		//RandomScroll Page
		
		js.executeScript("window.scrollBy(0,3500)", "");

		js.executeScript("return window.pageYOffset", ""); //Return the Y value
		
		System.out.println(js.executeScript("return window.pageXOffset", "")); // print in the console
		
		js.executeScript("window.scrollBy(0,4000)","");
		js.executeScript("return window.pageYOffset", "");
		System.out.println(js.executeScript("return window.pageYOffset", ""));*/
		
		//Display particular Element in the top
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//td[normalize-space()='Learn Selenium']"));
		WebElement var = driver.findElement(By.xpath("//td[normalize-space()='Learn Selenium']"));
		
		JavascriptExecutor js = driver;
		//js.executeScript("arguments[0].scrollIntoView();",var );
		
		//Print this scroll
		/*js.executeScript("return window.pageYOffset ", var);
		System.out.println(js.executeScript("return window.pageXOffset ", var));*/
		
		// Scroll from start to end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		js.executeScript("return window.pageYOffset", "")	;
		System.out.println(js.executeScript("return window.pageYOffset",""));
		
		
		

	}

}
