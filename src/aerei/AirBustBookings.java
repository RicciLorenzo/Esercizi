package aerei;

public class AirBustBookings extends Bookings {

	public AirBustBookings(int year) {
		super(new Date(1,1,year), new Date(31,12,year), 100, 500, new AirBustFleet());
	}

	
}
