
public class CTriangle extends CShape {
	private int a = 1;
	private int b = 1;
	private int c = 1;

	public CTriangle(int Side1, int Side2, int Side3) {
		shapename = "triangle";
		setSides(Side1, Side2, Side3);
	}

	public boolean setSides(int side1, int side2, int side3) {
		
		if (isValidPositive(side1)
				&& isValidPositive(side2)
				&& isValidPositive(side3))
		{
			this.a = side1;
			this.b = side2;
			this.c = side3;
			return true;
		}else{
		
			return false;
	}
	}
	private boolean isValidPositive(int v) {
		return (v > 0);
	}

	@Override
	protected double CalculateArea() {

		double sum = (a + b + c) / 2;
		return Math.sqrt(sum * (sum - a) * (sum - b) * (sum - c));
	}

	public String toString() {
		return "this is a " + shapename + " with area " + CalculateArea();
	}

	public boolean isTriangleValid(double a1, double b1, double c1) {
		if ((a1 + b1) > c1 && (a1 + c1) > b1 && (b1 + c1) > a1) {
			
			return true;
		
		} else {
			
			return false;
		}
	}

}