package aerei;

public class PriceChangedException extends BookingException {
	
	public PriceChangedException() {
		super("Flight prices has changed");
	}
	
}
