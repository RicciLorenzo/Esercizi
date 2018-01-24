package time;

public class Train implements Comparable<Train> {

	int number;
	String destination;
	Time time;
	
	public Train(Time time, int number, String destination) {		
		this.number=number;
		this.time=time;
		this.destination=destination;		
	}

	
	@Override
	public int compareTo(Train other) {
		// TODO Auto-generated method stub
		//... li mette in ordine temporale di partenza. A parita’ di partenza, li mette in ordine crescente per numero di treno
		
		if(this.time.compareTo(other.time)==0) {
			
			return (this.number-other.number);
			
		}
		
					
		return this.time.compareTo(other.time);
					
		
	}
	
	@Override 
	public String toString() {
		
		return String.format("%s : treno %d per %s", time.toStringOnlyHour(), number, destination); 
	
	}
	


	
}
