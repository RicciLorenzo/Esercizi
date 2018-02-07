package carrello;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart implements Iterable<Product> {
	
	// i prodotti contenuti in questo carrello 
	private final List<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product product) {
		//... aggiunge il prodotto indicato
		
		products.add(product);
		
	}
	
	public void addProducts(Product... products) {
		//... aggiunge tutti i prodotti indicati 
		
		for(Product product : products) {
			this.products.add(product);
		}
		
	} 
	
	public void addProduct(Product product, int howManyTimes) { 
		//... aggiunge il prodotto howManyTimes volte 
		
		for(int c=0;c<howManyTimes;c++) {
			products.add(product);
		}
		
	}
	
	@Override 
	public String toString() {
		String result = ""; 
		for (Product product: this) 
			result += product + " " + String.format("%.2f euro", product.getPrice(this)) + ". Venduto da " + product.getSeller() + "\n"; return result; 
	}
	
	@Override 
	public Iterator<Product> iterator() {
		//... 
		
		return products.iterator();
		
	}

}