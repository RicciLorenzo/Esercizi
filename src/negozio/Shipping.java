package negozio;

import java.util.ArrayList;

public class Shipping {
	
	private ArrayList<Product> p = new ArrayList<>();
	
	public Shipping(Iterable<Product> products) {
		//...crea una spedizione dei prodotti indicati 
		
		for(Product a : products) {
			p.add(a);
		}
			
		
		
	} 
	
	@Override 
	public String toString() {
		//...ritorna la concatenzione del toString() dei prodotti spediti
		
		String list="";
		
		for(Product a : p) {
			list+=a.toString()+"\n";	
		}
		
		return list;
		
	} 
}
