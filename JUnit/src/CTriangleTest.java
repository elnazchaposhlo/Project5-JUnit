import static org.junit.Assert.*;

import org.junit.Test;

public class CTriangleTest
{

	@Test
	public void testCalculateArea() 
	{
		CTriangle CTriangle4 = new CTriangle(2, 2, 2);
		
		double sum = (2 + 2 + 2) / 2;
		double area = (sum * (sum - 2) * (sum - 2) * (sum - 2));
		
		//correct output
		assertEquals(area, CTriangle4.CalculateArea(), 2);
		
		//incorrect output
		assertNotEquals(0, CTriangle4.CalculateArea());
	}
	
	@Test
	public void testCTriangle()
	{
		CTriangle CTriangle4 = new CTriangle(2, 2, 2);
		
		//correct output
		assertEquals("triangle", CTriangle4.shapename);
		
		//incorrect output
		assertEquals("triagle", CTriangle4.shapename);
	}
	
	@Test
	public void testSetSides() 
	{
		CTriangle CTriangle4 = new CTriangle(2, 2, 2);
		
		//correct output
		assertTrue(CTriangle4.setSides(2, 2, 2));
		
		//incorrect output
		assertTrue(CTriangle4.setSides(-1, 2, 10));
	}
	
	@Test
	public void testToString()
	{
		CTriangle CTriangle4 = new CTriangle(2, 2, 2);
		
		double sum = (2 + 2 + 2) / 2;
		double area = Math.sqrt(sum * (sum - 2) * (sum - 2) * (sum - 2));
		
		//correct output
		assertEquals("this is a triangle with area " + area, CTriangle4.toString());
		
		//incorrect output
		assertEquals("this is a rectangle with area " + area, CTriangle4.toString());
	}
}
