package dead_before;

public class Calculate {
	public double calculate(double price, boolean isDiscount) {
	    double discountPrice = 0;

	    if (isDiscount) {
	        if (price < 10000) {
	            discountPrice = price * 0.1;
	        } else {
	            discountPrice = price * 0.2;
	        }
	    }

	    if (isDiscount) // Dead code
	        discountPrice = price * 0.15;
	    
	    return price - discountPrice;
	}
}
