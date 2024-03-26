package comments_before;

public class Calculator {
	/**
	 * Calculates the area of a rectangle. This method assumes
	 * both length and width are positive values. If negative values
	 * are provided, the result might be unexpected.
	 *
	 * @param length The length of the rectangle.
	 * @param width  The width of the rectangle.
	 * @return The calculated area of the rectangle.
	 * @throws IllegalArgumentException if length or width is negative.
	 */
	public double calculateArea(double length, double width) {
	    if (length < 0 || width < 0) {
	        throw new IllegalArgumentException("Length and width must be positive values.");
	    }
	    return length * width;
	}
}
