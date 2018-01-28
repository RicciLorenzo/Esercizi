package pizza;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Order {
	
	private final Pizza[] ordine;
	
	public Order(Pizza... pizzas) {
		//...prende nota delle pizzas ordinate
		this.ordine=pizzas;
	}
	
	@Override
	public String toString() {
		//... ritorna la stampa delle pizze ordinate con i prezzi di ciascuna e in fondo il prezzo totale dell’ordine (si veda esempio in basso)
		
		String result="\n\nOrdine:\n\n";
		int tot=0;
		
		for(Pizza p : ordine) {
			result=result+"Pizza: "+p+"--Prezzo: "+p.getPrice()+"\n";
			tot=tot+p.getPrice();
		}
		result=result+"\nPrezzo TOTALE: "+tot;
		return result;
	}
	

	public int getPrice() {
		//... ritorna il prezzo totale dell’ordine 
		
		int tot=0;
		
		for(Pizza p : this.ordine) {
			tot=tot+p.getPrice();
		}
		
		return tot;
	}
	
}
