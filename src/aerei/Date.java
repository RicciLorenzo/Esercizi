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
	
	@Override
	public int compareTo(Date other) {
		/*Date otherD;
		if(other instanceof Date)
			otherD = (Date)other;
		
		if(this.day==otherD.day) {
			if(this.month==otherD.month) {
				if(this.year==otherD.year) {
					return 0;
				}
			}
		}
		
		if(this.year>otherD.year)
			return this.year-otherD.year;
		else if(this.year<otherD.year)
			return this.year-otherD.year;
		else if(this.month>otherD.month)
			return this.month-otherD.month;
		else if(this.month<otherD.month)
			return this.month-otherD.month;
		else if(this.day>otherD.day)
			return this.day-otherD.day;
		
		return this.day-otherD.day;*/
		
		int diff = day - other.day;
		if (diff != 0)
			return diff;

		diff = month - other.month;
		if (diff != 0)
			return diff;

		return year - other.year;
	} 
	
	@Override 
	public String toString() {
		//...ritorna una stringa del tipo dd/mm/yyyy... 
		return String.format("%2d/%2d/%4d",this.day,this.month,this.year);
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
