package duplicate_before;

public class Main {

	public static void main(String[] args) {
		class ShapeCalculator {
		    public double calculateCircleArea(double radius) {
		        return Math.PI * radius * radius;
		    }

		    public double calculateCirclePerimeter(double radius) {
		        return 2 * Math.PI * radius;
		    }

		    public double calculateSquareArea(double sideLength) {
		        return sideLength * sideLength;
		    }

		    public double calculateSquarePerimeter(double sideLength) {
		        return 4 * sideLength;
		    }
		}
	}
}
