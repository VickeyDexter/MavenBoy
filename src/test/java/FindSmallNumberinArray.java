import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindSmallNumberinArray {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		

		//Remove Dollar sign from the number eg., $45
		
		String num = "$45";
		String s1= num.replace("$", "");
		System.out.println(Double.parseDouble(s1));
		
		System.out.println("$"+s1);
		
		//Array - Find Smallest Number
		
		int a[]= {4,2,1,3,5};
		
		Arrays.sort(a);
		
		System.out.println(a[1]);
		
		//Add $ sign to the number
		System.out.println("$"+a[1]);
		
		
		
		
	}

}
