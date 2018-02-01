package negozio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SplitOrder extends Order { 
	
	public SplitOrder(Shop shop, Product... products) { 
		super(shop,products); 
	} 
	
	@Override 
	public Iterable<Shipping> ship() throws MissingProductException { 
		//...compra i prodotti e ritorna una o piu’ spedizioni 
		
		ArrayList<Shipping> spedizioniSplit = new ArrayList<>();
		HashMap<Integer, ArrayList<Product>> spedizioni = new HashMap<>();
		Product[] prodotti=this.getProducts();
		int n=0;
		
		for(Product product : prodotti) {
			n=product.getDaysBeforeShipping();
			
			if(!spedizioni.containsKey(n)) {
				
				spedizioni.put(n, new ArrayList<Product>());
				spedizioni.get(n).add(product);
				
			}
			
			else if(spedizioni.containsKey(n)) {
				
				spedizioni.get(n).add(product);
				
			}
				
				
		}
		
		for(int a : spedizioni.keySet()) {
			spedizioniSplit.add(new Shipping(spedizioni.get(a)));
		}
		
		return spedizioniSplit;
		
	} 
} 