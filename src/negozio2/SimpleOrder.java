package negozio2;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleOrder extends Order { 
	
	public SimpleOrder(Shop shop, Product... products) { 
		
		super(shop,products);
		
	} 
	
	@Override 
	public Iterable<Shipping> ship() throws MissingProductException { 

		//compra i prodotti e ritorna un iterabile con un�unica spedizione 
		
		ArrayList<Shipping> spedizione = new ArrayList<>();
		spedizione.add(new Shipping(Arrays.asList(this.getProducts())));
		buy();
		
		return spedizione;

		
	} 

}