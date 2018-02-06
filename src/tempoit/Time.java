package tempoit;

public class Time implements Comparable<Time> { 

	int year;
	int month;
	int day;
	int hours;
	int minutes;
	
	public Time(int year, int month, int day, int hours, int minutes) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.hours=hours;
		this.minutes=minutes;
	}
	
	@Override 
	public int compareTo(Time other) {

		if(this.year>other.year)
			return 1;
		
		if(this.year<other.year)
			return -1;
		
		if(this.year==other.year) {
			if(this.month>other.month)
				return 1;
			if(this.month<other.month)
				return -1;
			if(this.month==other.month) {
				if(this.day>other.day)
					return 1;
				if(this.day<other.day)
					return -1;
				if(this.day==other.day) {
					if(this.hours>other.hours)
						return 1;
					if(this.hours<other.hours)
						return -1;
					if(this.hours==other.hours) {
						if(this.minutes>other.minutes)
							return 1;
						if(this.minutes<other.minutes)
							return -1;
						if(this.minutes==other.minutes)
							return 0;
					}
				}
			}
				
		}
		
		return 0;
		
	}
	
	public String toStringOnlyHour() {
		//... ritorna stringhe del tipo hh:mm (solo ore e minuti)
		
		String result="";
		
		result=String.format("%d:%02d",this.hours,this.minutes);
		
		return result;
		
	}
}