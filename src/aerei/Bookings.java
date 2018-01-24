package aerei;

import java.util.HashMap;

public class Bookings {

	private Date start,end;
	private int minimalPrice,maximalPrice;
	private Fleet fleet;
	
	private HashMap<Date,Integer> postiLiberi = new HashMap<>();

	
	protected Bookings(Date start, Date end, int minimalPrice, int maximalPrice, Fleet fleet) {
		//...lancia una IllegalArgumentException se start viene dopo di end oppure se minimalPrice e’ superiore a maximalPrice o negativo
		
		this.start=start;
		this.end=end;
		this.minimalPrice=minimalPrice;
		this.maximalPrice=maximalPrice;
		this.fleet=fleet;
		
		if((start.compareTo(end))<0)
			throw new IllegalArgumentException("Start date is after the end of the booking date");
		
		if(minimalPrice<0 || minimalPrice>maximalPrice)
			throw new IllegalArgumentException("Minimal price is higher than the maximal price, or it is negative");
			
			
	}

	


	// ritorna il prezzo del biglietto per la data indicata 
	public int getQuoteFor(Date when) throws QuoteException {
		//...lancia una IllegalBookingDatesException se when non e’ tra start ed end incluse 
		//...lancia una FlightSoldOutException se per la data when non ci sono piu’ posti nell’aereo 
		//...ritorna il prezzo del biglietto per la data when, distribuendo uniformemente il prezzo: 
		//...se l’aereo e’ vuoto, il prezzo e’ minimalPrice, se rimane l’ultimo biglietto, il prezzo e’ maximalPrice 
		
		if(when.compareTo(start)<0 || when.compareTo(end)>0)
			throw new IllegalBookingDatesException();
		
		if((fleet.getAircraftFor(when)).getCapacity()==0)
			throw new FlightSoldOutException();
		
		postiLiberi.put(start,new Integer(30));
		
	}
	
	// compra un biglietto per la data indicata,purche’ costi il prezzo indicato 
	public void book(Date when, int price) throws BookingException {
		//...lancia una IllegalBookingDatesException se when non e’ tra start ed end incluse 
		//...lancia una FlightSoldOutException se per la data when non ci sono piu’ posti nell’aereo 
		//...lancia una PriceChangedException se price non e’ il prezzo per la data indicata 
		//...altrimenti prenota un biglietto per la data indicata 
	}
	
	public int book(Date when) throws BookingException {
		//...lancia una IllegalBookingDatesException se when non e’ tra start ed end incluse 
		//...lancia una FlightSoldOutException se per la data when non ci sono piu’ posti nell’aereo 
		//...altrimenti prenota un biglietto per la data indicata, a qualsiasi prezzo, e ritorna tale prezzo 
	}
	
	@Override 
	public String toString() {
		//...ritorna una tabella con le date per cui si sono venduti biglietti, indicando quanti ne sono stati venduti per ogni data 
		//...e che tipo di aereo e’ previsto per quella data. La tabella deve essere in ordine cronologico 
	}
	

	
}
