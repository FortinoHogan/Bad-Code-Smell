package dead_after;

public class Calculate {
	public double calculate(double price, boolean isDiscount) {
	    double discountRate = isDiscount ? 0.15 : 0;
	    double discountPrice = price * discountRate;
	    
	    return price - discountPrice;
	}
}
