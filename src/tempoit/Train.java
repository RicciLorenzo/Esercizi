package tempoit;

public class Train implements Comparable<Train> { 
	private Time time;
	private int number;
	private String destination;
	
	public Train(Time time, int number, String destination) {
		this.time=time;
		this.number=number;
		this.destination=destination;
	}
	
	@Override 
	public String toString() { 
		
		return String.format("%s : treno %d per %s", time.toStringOnlyHour(), number, destination); 
		
	}
	
	@Override 
	public int compareTo(Train other) {
		//... li mette in ordine temporale di partenza. A parita’ di partenza, li mette in ordine crescente per numero di treno
		if(this.time.compareTo(other.time)>0)
			return 1;
		if(this.time.compareTo(other.time)<0)
			return -1;
		if(this.time.compareTo(other.time)==0) {
			if(this.number>other.number)
				return 1;
			if(this.number<other.number)
				return -1;
			if(this.number==other.number)
				return 0;
		}
			
		
		return 0;
	}

}