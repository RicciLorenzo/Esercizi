package aerei;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Bookings {

	private Date start,end;
	private int minimalPrice,maximalPrice;
	private Fleet fleet;
	
	private SortedMap<Date,Integer> postiOccupati = new TreeMap<>();

	
	protected Bookings(Date start, Date end, int minimalPrice, int maximalPrice, Fleet fleet) {
		//...lancia una IllegalArgumentException se start viene dopo di end oppure se minimalPrice e’ superiore a maximalPrice o negativo
		
		this.start=start;
		this.end=end;
		this.minimalPrice=minimalPrice;
		this.maximalPrice=maximalPrice;
		this.fleet=fleet;
		
		if((start.compareTo(end))>0)
			throw new IllegalArgumentException("Start date is after the end of the booking date");
		
		if(minimalPrice<0 || minimalPrice>maximalPrice)
			throw new IllegalArgumentException("Minimal price is higher than the maximal price, or it is negative");
			
	}

	private boolean soldOut(Date when) {
		
		int postiLiberi=fleet.getAircraftFor(when).getCapacity();
		postiOccupati.putIfAbsent(when, 0);
		if(postiLiberi-(postiOccupati.get(when))==0)
			return true;
		
		return false;
		
	}


	// ritorna il prezzo del biglietto per la data indicata 
	public int getQuoteFor(Date when) throws QuoteException {
		//...lancia una IllegalBookingDatesException se when non e’ tra start ed end incluse 
		//...lancia una FlightSoldOutException se per la data when non ci sono piu’ posti nell’aereo 
		//...ritorna il prezzo del biglietto per la data when, distribuendo uniformemente il prezzo: 
		//...se l’aereo e’ vuoto, il prezzo e’ minimalPrice, se rimane l’ultimo biglietto, il prezzo e’ maximalPrice 
		
		if(when.compareTo(start)<0 || when.compareTo(end)>0)
			throw new IllegalBookingDatesException();
		
		if(soldOut(when))
			throw new FlightSoldOutException();
		
		if(soldOut(when))
			return this.maximalPrice;
		else if(postiOccupati.get(when)==0)
			return this.minimalPrice;
		else
			return minimalPrice + postiOccupati.get(when) * (maximalPrice - minimalPrice) / (fleet.getAircraftFor(when).getCapacity() - 1);
	
	}
	
	// compra un biglietto per la data indicata,purche’ costi il prezzo indicato 
	public void book(Date when, int price) throws BookingException {
		//...lancia una IllegalBookingDatesException se when non e’ tra start ed end incluse 
		//...lancia una FlightSoldOutException se per la data when non ci sono piu’ posti nell’aereo 
		//...lancia una PriceChangedException se price non e’ il prezzo per la data indicata 
		//...altrimenti prenota un biglietto per la data indicata 
		
		if(price==getQuoteFor(when))
			postiOccupati.put(when, (postiOccupati.get(when)+1));
		else
			throw new PriceChangedException();

		
	}
	
	
	public int book(Date when) throws BookingException {
		//...lancia una IllegalBookingDatesException se when non e’ tra start ed end incluse 
		//...lancia una FlightSoldOutException se per la data when non ci sono piu’ posti nell’aereo 
		//...altrimenti prenota un biglietto per la data indicata, a qualsiasi prezzo, e ritorna tale prezzo 
		int price= getQuoteFor(when);
		postiOccupati.put(when, (postiOccupati.get(when)+1));
		
		return price;
		
		
	}
	
	@Override 
	public String toString() {
		//...ritorna una tabella con le date per cui si sono venduti biglietti, indicando quanti ne sono stati venduti per ogni data 
		//...e che tipo di aereo e’ previsto per quella data. La tabella deve essere in ordine cronologico 
		String tabella="";
		for(Map.Entry m:postiOccupati.entrySet()) {
			tabella+= m.getKey()+" "+postiOccupati.get(m.getKey())+" ["+fleet.getAircraftFor((Date) m.getKey()).toString()+"]\n";
		}
		
		return tabella;
		
	}
	

	
}
