import static org.junit.Assert.*;

import org.junit.Test;

public class CCircleTest {

	@Test
	public void testCalculateArea()
	{
		CCircle CCircle1 = new CCircle(4);
		
		//correct output
		assertEquals(4*4*Math.PI, CCircle1.CalculateArea(), 2);
		
		//incorrect output
		assertEquals(4*3*Math.PI, CCircle1.CalculateArea(), 2);
	}

	@Test
	public void testCCircle()
	{
		CCircle CCircle1 = new CCircle(4);
		
		//correct output
		assertEquals("circle", CCircle1.shapename);
		
		//incorrect output
	    assertNotEquals("circle", CCircle1.shapename);

	}

	@Test
	public void testToString()
	{
		CCircle CCircle1 = new CCircle(4);
		
		//correct output
		assertEquals("this is a circle with area " + (4*4*Math.PI), CCircle1.toString());
		
		//incorrect output
		assertEquals("this is a square with area " + (4*4*Math.PI), CCircle1.toString());
	}

}
