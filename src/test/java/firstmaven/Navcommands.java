package firstmaven;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navcommands {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://amazon.in/");
		
		//driver.get("https://www.flipkart.com/");
		
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().back(); // amazon
		System.out.println(driver.getCurrentUrl());  // amazon url
		
		driver.navigate().forward(); // flipkart
		System.out.println(driver.getCurrentUrl()); // flipkart url
		
		driver.navigate().refresh();
		
		
		
		
	}

}
