package doodle;

public class Slot implements Comparable<Slot> {
	
	private int year;
	private int month;
	private int day;
	private Moment moment;
	
	public Slot(int year, int month, int day, Moment moment) {
		this.day=day;
		this.month=month;
		this.year=year;
		this.moment=moment;
	} 
	
	public int compareTo(Slot other) {
	
		int diff=this.year-other.year;
		if(diff!=0)
			return diff;
		
		diff=this.month-other.month;
		if(diff!=0)
			return diff;
		
		diff=this.day-other.day;
		if(diff!=0)
			return diff;
		
		return this.moment.compareTo(other.moment);
		
	} // ordina per anno, mese, giorno e infine momento 
	
	
	
	public boolean equals(Object other) {
		Slot altro;
		if(other instanceof Slot) {
			altro=(Slot)other;
		}
		else
			return false;
		
		if(this.year==altro.year) {
			if(this.month==altro.month) {
				if(this.day==altro.day) {
					if(this.moment==altro.moment)
						return true;
				}
			}
		}
			
		
		return false;
		
		
	} // confronta tutti e quattro le componenti degli Slot 
	
	public int hashCode() {
		
		return this.day^this.month^this.year^this.moment.hashCode();
		
	} 
	
	public String toString() {
		String result="";
		result=this.day+"/"+this.month+"/"+this.year+" "+this.moment+" ";
				
		return result;
		
	} // ritorna una stringa del tipo "3/2/2017 AFTERNOON"
	
	

	public enum Moment {
		MORNING, AFTERNOON, EVENING, NIGHT 
	}
	
	
	
}