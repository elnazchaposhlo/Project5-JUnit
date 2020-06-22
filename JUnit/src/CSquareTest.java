import static org.junit.Assert.*;

import org.junit.Test;

public class CSquareTest {

	@Test
	public void testToString() 
	{
		CSquare CSquare3 = new CSquare(6);
		
		//correct output
		assertEquals("this is a square with area " + (6*6*1.0), CSquare3.toString());
		
		//incorrect output
		assertEquals("this is a square with area " + (6*8*1.0), CSquare3.toString());
	}

	@Test
	public void testCSquare() 
	{
		CSquare CSquare3 = new CSquare(6);
		
		//correct output
		assertEquals("square", CSquare3.shapename);
		
		//incorrect output
		assertNotEquals("square", CSquare3.shapename);
		
	}

}
