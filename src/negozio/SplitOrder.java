package negozio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitOrder extends Order {
	
	public SplitOrder(Shop shop, Product... products) {
		super(shop,products);
	} 
	
	@Override 
	public Iterable<Shipping> ship() throws MissingProductException {
		//...compra i prodotti e ritorna una o piu’ spedizioni 
		
		this.buy();
		
		Map<Integer, List<Product>> spedizioni = new HashMap<>();
		for(Product product : getProducts()) {
			int day=product.getDaysBeforeShipping();
			spedizioni.putIfAbsent(day, new ArrayList<>());
			spedizioni.get(day).add(product);
		}
		
		ArrayList<Shipping> allSplitted = new ArrayList<>();
		for(int a : spedizioni.keySet()) {
			allSplitted.add(new Shipping(spedizioni.get(a)));
		}
		
		return allSplitted;
		
	} 
	
}