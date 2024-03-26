package duplicate_after;

public class Main {

	public static void main(String[] args) {
		class Circle {
		    public double calculateArea(double radius) {
		        return Math.PI * radius * radius;
		    }

		    public double calculatePerimeter(double radius) {
		        return 2 * Math.PI * radius;
		    }
		}

		class Square {
		    public double calculateArea(double sideLength) {
		        return sideLength * sideLength;
		    }

		    public double calculatePerimeter(double sideLength) {
		        return 4 * sideLength;
		    }
		}

	}

}
