package negozio2;

import java.util.HashMap;
import java.util.Map;

import negozio.MissingProductException;

public class Shop {
	//... 
	Product product;
	int howMany;
	HashMap<Product,Integer> shop = new HashMap<>();
	
	public void add(Product product, int howMany) {
		//...aggiunge howMany volte il prodotto indicato, che poteva gia’ essere presente in negozio
		if(shop.containsKey(product)) {
			shop.put(product, shop.get(product)+howMany);
		}
		
		shop.put(product, howMany);
	}
	void buy(Product[] productsToBuy) throws MissingProductException { 
		//rimuove i prodotti indicati da quelli disponibili in questo negozio; 
		//se non fossero disponibili tutti i prodotti, lancia una MissingProductException; 
		//in tal caso, il negozio dovra’ restare immutato e nessun prodotto dovra’ venire tolto 
		
		if(!shop.containsKey(productsToBuy))
			throw new MissingProductException();
		
		shop.remove(productsToBuy);
		
	}
}