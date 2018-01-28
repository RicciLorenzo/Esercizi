package doodle;

public class Slot implements Comparable<Slot> {
	
	... 
	
	public Slot(int year, int month, int day, Moment moment) {
		... 
	} 
	
	public int compareTo(Slot other) {
	... 
	} // ordina per anno, mese, giorno e infine momento 
	
	public boolean equals(Object other) {
		... 
	} // confronta tutti e quattro le componenti degli Slot public int hashCode() { ... } 
	
	public String toString() {
		... 
	} // ritorna una stringa del tipo "3/2/2017 AFTERNOON"

	public enum Moment {
		MORNING, AFTERNOON, EVENING, NIGHT 
	}
	
}