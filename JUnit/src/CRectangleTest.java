import static org.junit.Assert.*;

import org.junit.Test;

public class CRectangleTest
{
	
	@Test
	public void testCalculateArea()
	{
		CRectangle CRectangle2 = new CRectangle(3,4);
		
		//correct output
		assertEquals(3*4, CRectangle2.CalculateArea(),3);
		
		//incorrect output
		assertEquals(3+4, CRectangle2.CalculateArea(),3);
	}
	
	@Test
	public void testCRectangle()
	{
		CRectangle CRectangle2 = new CRectangle(3,4);
		
		//correct output
		assertEquals("rectangle", CRectangle2.shapename);
		
		//incorrect output
		assertEquals("triangle", CRectangle2.shapename);
	}
	
	@Test
	public void testSetLength()
	{
		CRectangle CRectangle2 = new CRectangle(3,4);
		
		//correct output
		assertEquals(3, CRectangle2.setLength(3));
		
		//incorrect output
		assertEquals(3, CRectangle2.setLength(8));
	}
	
	@Test
	public void testSetWidth()
	{
		CRectangle CRectangle2 = new CRectangle(3,4);
		
		//correct output
		assertEquals(4, CRectangle2.setWidth(4));
		
		//incorrect output
		assertNotEquals(4, CRectangle2.setWidth(4));
	}
	
	@Test
	public void testToString()
	{
		CRectangle CRectangle2 = new CRectangle(3,4);
		
		//correct output
		assertEquals("this is a rectangle with area " + (3*4*1.0), CRectangle2.toString());
		
		//incorrect output
		assertEquals("this is a rectangle with area " + (3*4), CRectangle2.toString());
	}

}
