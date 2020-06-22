
public class CSquare extends CRectangle {

	public CSquare(int length)
	{	
		super(length, length);
		this.shapename = "square";
	}
	
	public String toString()
	{
		return "this is a " + shapename + " with area " + CalculateArea();
	}
}

