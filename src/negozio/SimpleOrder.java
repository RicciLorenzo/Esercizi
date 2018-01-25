package negozio;

import java.util.ArrayList;

public class SimpleOrder extends Order {
	
	public SimpleOrder(Shop shop, Product... products) {
		 
		super(shop, products);
		
	} 
	
	@Override 
	public Iterable<Shipping> ship() throws MissingProductException {
		//...compra i prodotti e ritorna un iterabile con un’unica spedizione
		ArrayList<Shipping> s = new ArrayList<>(new Shipping(super.getProducts()));
		super.buy();
		
	} 
}