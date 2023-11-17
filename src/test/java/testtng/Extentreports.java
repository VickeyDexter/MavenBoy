package testtng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Extentreports 

{
	
	@Test
void method1()
{
	Assert.assertEquals(1,1);
}

	@Test
void method2()
{
	Assert.assertEquals("a", "b");
}
@Test(dependsOnMethods= {"method2"})
void method3()
{
	Assert.assertEquals("a"," a");
}










}
