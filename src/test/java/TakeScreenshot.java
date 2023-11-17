import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException 
	
	{
	ChromeDriver	driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	
	driver.manage().window().maximize();
	
	//TAKE FULL PAGE SCREENSHOT
	TakesScreenshot ts = driver; //Type Cast only for Webdriver instance.
	
	ts.getScreenshotAs(OutputType.FILE);
	File src = ts.getScreenshotAs(OutputType.FILE); //not visible
	
	File trg = new File("C:\\Program Files\\Java\\jdk-20\\Selenium\\eclipse\\MavenBoy\\Screenshots\\ ");
	
	FileUtils.copyFile(src, trg);
	
	//TO CAPTURE PARTICULAR ELEMENT FROM THE WEBPAGE
	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	
	WebElement var = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	
	File sc =var.getScreenshotAs(OutputType.FILE);
	
	File tar = new File("C:\\Program Files\\Java\\jdk-20\\Selenium\\eclipse\\MavenBoy\\Screenshots\\logo.png");
	
	FileUtils.copyFile(sc, tar);
		
	}

}
