
public class testShape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// program starts here
		
		//CShape r1 = new CRectangle(10, 5);
		//CShape r2 = new CRectangle(2, 4);
		
		//System.out.println("Area of r1 is " + r1.CalculateArea());
		//System.out.println("Area of r2 is " + r2.CalculateArea());

		// Let there be canvas!
		CShape[] canvas = new CShape[3];
		
		canvas[0] = new CRectangle(10, 2);
		canvas[1] = new CCircle(10);
		canvas[2] = new CCircle(20);
		
		for (int i=0; i < 3; i++)
		{
			System.out.println(canvas[i]);
		}
		
	}

}
