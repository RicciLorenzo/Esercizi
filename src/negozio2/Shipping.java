package negozio2;

import java.util.ArrayList;

public class Shipping {
	//... 
	ArrayList<Product> spedizione = new ArrayList<>();
	
	Shipping(Iterable<Product> products) {
		//...crea una spedizione dei prodotti indicati
		for(Product prodotti : products) {
			spedizione.add(prodotti);
		}
	} 
	
	@Override 
	public String toString() {
		
		String result="";
		
		for(Product products : spedizione) {
			
			result+=products.toString()+"\n";
			
		}
		
		return result;
		
	} 
}
