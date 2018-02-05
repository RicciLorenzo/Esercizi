package calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Calendar {
	  private final int year; // l'anno del calendario
	  private HashMap<String,int[]> mesi = new HashMap<>();
	  
	  public Calendar(int year) {
	    // costruisce il calendario per l'anno indicato
		
		  this.year=year;
		  int a[]=new int[31];
		  for(int c=0;c<31;c++) {
			  a[c]=c++;
		  }
		  int b[]=new int[30];
		  for(int c=0;c<30;c++) {
			  b[c]=c++;
		  }
		  
		  mesi.put("Gennaio",a);
		  
		  if(isLeapYear()) {
			  int s[]=new int[29];
			  for(int c=0;c<29;c++) {
				  s[c]=c++;
			  }
			  mesi.put("Febbraio",s);
		  }
		  else {
			  int x[]=new int[28];
			  for(int c=0;c<28;c++) {
				  x[c]=c++;
			  }
			  mesi.put("Febbraio",x);
		  }
			  
		  mesi.put("Febbraio",b);
		  mesi.put("Marzo", a);
		  mesi.put("Aprile",b);
		  mesi.put("Maggio", a);
		  mesi.put("Giugno",b);
		  mesi.put("Luglio", a);
		  mesi.put("Agosto", a);
		  mesi.put("Settembre",b);
		  mesi.put("Ottobre", a);
		  mesi.put("Novembre",b);
		  mesi.put("Dicembre", a);
		  
		  
		  
	  }

	  public boolean isLeapYear() {
	    // determina se il calendario è per un anno bisestile
		  
		  if(this.year%4==0 || ((this.year%100==0)&&this.year%400==0))
			  return true;
		  
		  return false;
		  
	  }

	  public Date getStart() {
	    // restituisce la prima data del calendario (primo gennaio)
		  return new Calendar.Date(0);
	  }

	  public Date getEnd() {
	    // restituisce l'ultima data del calendario (31 dicembre)
		  if(isLeapYear())
			  return new Calendar.Date(365);
		  else
			  return new Calendar.Date(364);
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
	      if(daysFromStart<31) 
	    	  return daysFromStart+1;
	      if(daysFromStart>30 && daysFromStart<58) {
	    	  int temp=-30;
	    	  return temp+daysFromStart;
	    	}
	      if(isLeapYear()) {
		      if(daysFromStart>30 && daysFromStart<58) {
		    	  int temp=-30;
		    	  return temp+daysFromStart;
		    	}
	      }
	      if(daysFromStart>30 && daysFromStart<57) {
	    	  int temp=-30;
	    	  return temp+daysFromStart;
	    	}
	      
	    	  
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