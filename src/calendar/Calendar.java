package calendar;
import java.util.Date;

public class Calendar {
	  private final int year; // l'anno del calendario
		
	  public Calendar(int year) {
	    // costruisce il calendario per l'anno indicato
		  
		  this.year=year;
	  }

	  public boolean isLeapYear() {
	    // determina se il calendario è per un anno bisestile
	  }

	  public Date getStart() {
	    // restituisce la prima data del calendario (primo gennaio)
		  Date data = new Date();
	  }

	  public Date getEnd() {
	    // restituisce l'ultima data del calendario (31 dicembre)
	  }

	  // classe interna
	  public class Date {
	    // 0 = primo gennaio, 364 = 31 dicembre (per i bisestili: 365 = 31 dicembre)
	    private final int daysFromStart;

	    private Date(int daysFromStart) {
	      this.daysFromStart = daysFromStart;
	    }

	    // ritorna il giorno di questa data, tra 1 e 31
	    public int getDay() {
	      ...
	    }

	    // ritorna il mese di questa data tra 1 e 12
	    public int getMonth() {
	      ...
	    }

	    // ritorna l'anno di questa data
	    public int getYear() {
	      ...
	    }

	    public String toString() {
	      return String.format("%d/%d/%d", getDay(), getMonth(), getYear());
	    }
	  }
	}