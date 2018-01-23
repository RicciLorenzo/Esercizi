package time;

public class Time implements Comparable<Time> {
	
	private int year;
	private int month;
	private int day;
	private int hours;
	private int minutes;
	
	public Time(int year, int month, int day, int hours, int minutes) {
		
		this.year=year;
		this.month=month;
		this.day=day;
		this.hours=hours;
		this.minutes=minutes;
		
	}
	
	
	@Override
	public int compareTo(Time arg0) {
		
		// TODO Auto-generated method stub
		// Restituisce 0 se sono uguali; minore di 0 se "other" é una data maggiore; ritorna maggiore di 0 se this é maggiore.
		
		
		
		return 0;
	}
	
	public String toStringOnlyHour() {
		
		//... ritorna stringhe del tipo hh:mm (solo ore e minuti)		
		
		/*if(this.minutes==00 && this.hours==00)
			return "00:00";
		
		if(this.hours==00) 
			return "00:"+this.minutes;
		
		if(this.minutes==00)
			return this.hours+":00";
		
		return this.hours+":"+this.minutes;*/
		
		return String.format("%02d:%02d", this.hours,this.minutes);		//VERSIONE PRO		
		
	}
	
	
	
}
