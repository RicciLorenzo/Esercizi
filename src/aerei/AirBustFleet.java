package aerei;

public class AirBustFleet implements Fleet {

	private final Aircraft A380 = new Aircraft("A380",388);
	private final Aircraft A330 = new Aircraft("A330",277);
	private final Aircraft A320 = new Aircraft("A320",200);
	
	@Override
	public Aircraft getAircraftFor(Date data) {
		
		if(data.isXmas() || data.isThanksgiving() || data.isNewYearsEve())
			return A380;
		else if(data.isColumbusDay())
			return A330;
		else
			return A320;
		
	}

}
