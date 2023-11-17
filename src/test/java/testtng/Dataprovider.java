package testtng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 

{

WebDriver driver;

@BeforeClass 
void chumma()
{
	driver= new ChromeDriver();
}

@Test(dataProvider="dp")
void method1(String Username,String Password)
{
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Username);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
}



@DataProvider(name="dp")
String[][] data()
{
	String a [][]= {{"Admin","admin123"},{"admin","bsiv"},{"admin","Adinm"}};
	return data();
}















}
