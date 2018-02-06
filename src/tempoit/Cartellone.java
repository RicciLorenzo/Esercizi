package tempoit;

public abstract class Cartellone implements Iterable<Train> {
	
	@Override 
	public final String toString() {
		//... ritorna la concatenazione del toString() di tutti i treni nel cartellone
		
		String result="";
		
		for(Train train : this) {
			result+=train.toString()+"\n";
		}
		
		return result;
		
	}
	
}
