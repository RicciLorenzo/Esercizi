package aerei;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	} 
	
	@Override 
	public boolean equals(Object other) {
		Date otherAsDate;
		if(other instanceof Date)
			otherAsDate = (Date)other;
		else
			return false;
		
		if(this.day==otherAsDate.day) {
			if(this.month==otherAsDate.month) {
				if(this.year==otherAsDate.year) {
					return true;
				}
			}
		}
		
		return false;
	} 
	
	@Override 
	public int hashCode() {
		return this.day^this.month^this.year;
	}
	
	public int compareTo(Date other) {
		if(this.day==other.day) {
			if(this.month==other.month) {
				if(this.year==other.year) {
					return 0;
				}
			}
		}
		
		if(this.year>other.year)
			return this.year-other.year;
		else if(this.year<other.year)
			return this.year-other.year;
		else if(this.month>other.month)
			return this.month-other.month;
		else if(this.month<other.month)
			return this.month-other.month;
		else if(this.day>other.day)
			return this.day-other.day;
		
		return this.day-other.day;
	} 
	
	@Override 
	public String toString() {
		//...ritorna una stringa del tipo dd/mm/yyyy... 
		return String.format("2%i/2%i/4%i",this.day,this.month,this.year);
	} 
	
	public boolean isXmas() {
		return this.month==12 && this.day==25;
	} 
	
	public boolean isNewYearsEve() {
		//...determina se this e’ il 31/12... 
		return this.month==12 && this.day==31;
	} 
	
	public boolean isThanksgiving() {
		//...determina se this e’ il 23/11... 
		return this.month==11 && this.day==23;
	} 
	
	public boolean isAllSaintsDay() {
		//...determina se this e’ l’1/11... 
		return this.month==11 && this.day==1;
	} 
	
	public boolean isColumbusDay() {
		//...determina se this e’ il 9/10... 
		return this.month==10 && this.day==9;
	} 
	
	public boolean isLincolnBirthday() {
		//...determina se this e’ il 12/2... 
		return this.month==2 && this.day==12;
	}
	

	
}
