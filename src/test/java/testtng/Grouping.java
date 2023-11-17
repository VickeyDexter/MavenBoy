package testtng;

import org.testng.annotations.Test;

public class Grouping
/*India								League Stage
 * Afghanistan
 * Australia						Qualification & League Stage
 * New Zealand
 * Pakistan						Semi - Final
 * Sri Lanka						
 * Netherlands					League Stage
 * South Africa					
 * England
 * Bangladesh					Final
 */

{
	@Test(priority=1,groups={"Final"})
void countries()
{
	System.out.println("This is India");
}
	
	@Test(groups={"Qualification","League Stage"})
	void countries2()
	{
		System.out.println("This is Afghanistan");
	}
	
	@Test(priority=3,groups={"Final"})
	void countries3()
	{
		System.out.println("This is Australia");
	}
	
	@Test(priority=4,groups={"Semi Final"})
	void countries4()
	{
		System.out.println("This is New Zealand");
	}
	
	@Test(priority=5,groups={"League Stage"})
	void countries5()
	{
		System.out.println("This is Pakistan");
	}
	
	@Test(priority=6,groups={"League Stage"})
	void countries6()
	{
		System.out.println("This is Sri Lanka");
	}
	
	@Test(priority=7,groups={"Qualification","League Stage"})
	void countries7()
	{
		System.out.println("This is Netherlands");
	}
	
	@Test(priority=8,groups={"Semi Final"})
	void countries8()
	{
		System.out.println("This is South Africa");
	}
	
	@Test(priority=9,groups={"Semi Final"})
	void countries9()
	{
		System.out.println("This is England");
	}
	
	@Test(priority=10,groups={"League Stage"})
	void countries10()
	{
		System.out.println("This is Bangladesh");
	}
	













}
