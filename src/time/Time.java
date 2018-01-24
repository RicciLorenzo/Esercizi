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
	public int compareTo(Time other) {
		
		// TODO Auto-generated method stub
		// Restituisce 0 se sono uguali; minore di 0 se "other" é una data maggiore; ritorna maggiore di 0 se this é maggiore.
		
		//if(this.year==other.year && this.month==other.month && this.day==other.day && this.hours==other.hours && this.minutes==other.minutes)
		//	return 0;
		
		if(this.year>other.year) 
			return 1;
		
		
		else if(this.year<other.year)
			return -1;
		
		if(this.month>other.month)
			return 1;
		else if(this.month<other.month)
			return -1;
		
		if(this.day>other.day)
			return 1;
		else if(this.day<other.day)
			return -1;
		
		if(this.hours>other.hours)
			return 1;
		else if(this.hours<other.hours)
			return-1;
		
		if(this.minutes>other.minutes)
			return 1;
		else if(this.minutes<other.minutes)
			return -1;
		
	
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
