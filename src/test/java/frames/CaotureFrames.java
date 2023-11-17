package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaotureFrames {

	public static void main(String[] args) {
		
		
		//DRIVER INSTANCE
				ChromeDriver driver = new ChromeDriver();
				
				//LINK
				driver.get("https://ui.vision/demo/webtest/frames/");
				
				//MAXIMIZE PAGE
				driver.manage().window().maximize();
				
				//CAPTURE XPATH OF FRAME 1 PAGE
				driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
			
				// SWITCH DRIVER TO FRAME
				//driver.switchTo().frame(WebElement Variable)
				
				//STORE XPATH IN A VARIABLE THEN CONVERT DRIVER TO FRAME
			   WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
			   
               driver.switchTo().frame(frame1);
              
               	// ENTER TEXT SO CAPTURE X PATH OF THE TEXT ELEMENT
               driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("I will Master Selenium & Get a High Paying Job");
               
               // NOW WE HAVE IDENTIFIED FRAME 1 , NOW WE CAN SWITCH THE DRIVER BACK TO DEFAULT
               driver.switchTo().defaultContent();
               
               // CAPTURING FRAME 2
               driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
               
               //SWITCHING DRIVER TO FRAME 2 ; WE NEED A VARIABLE SO STORE FINDELEMENT IN A VARIABLE
               WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
               
               driver.switchTo().frame(frame2);
               
               // CAPTURE XPATH OF TEXT BOX ELEMENT
               driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Motivation");
               
               //NOW MOVING BACK OUR DRIVER TO DEFAULT
               driver.switchTo().defaultContent();
               
               //CAPTURE FRAME 4
               driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
               
               //STORING FRAME IN A VAR FOR DRIVER SWITCHING
               WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
               
               driver.switchTo().frame(frame4);
               
               //CAPTURE TEXT ELEMENT
               driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Keep Going");
               
               //SWITCHING DRIVER BACK TO DEFAULT
               driver.switchTo().defaultContent();
               
               //FIRST CAPTURE FRAME 3 [WHICH HAS AN IFRAME]
               driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
               
               //STORE IT IN A VAR AND SWITCH THE DRIVER TO FRAME
             WebElement  frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
             
             driver.switchTo().frame(frame3);
             
             //WE CAPTURED THE PAGE , NOW WE WILL CAPTURE THE TEXT BOX
             driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("iframe");
             
             //WE CAPTURED PARENT FRAME WHICH HOLDS THE IFRAME
             // WE CAN WSWITCH OUR DRIVER FROM PARENT FRAME TO IFRAME USING INDEX
             driver.switchTo().frame(0);
             
             driver.findElement(By.cssSelector("div.AB7Lab")).click();
             
             //OPERATION DONE IN IFRAME SO WE CAN SWITCH OUR DRIVER BACK TO DEFAULT
             driver.switchTo().defaultContent();
             
             
             
               
               
	
	
	
	
	}
	
	
	
	

}
