package negozio2;

import java.util.ArrayList;
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
		
		ArrayList<Product> rimossi = new ArrayList<>();
		
		for(Product product : productsToBuy) {
			if(shop.containsKey(product)) {
				rimossi.add(product);
				int n=shop.get(product);
				n-=1;
				
				if(n==0)
					shop.remove(product);
				else {
					shop.remove(product);
					shop.put(product, n);
				}
			}
			else {
				
				for(Product restore : rimossi) {
					
					if(!shop.containsKey(restore))
						shop.putIfAbsent(restore, 1);
					else {
						int c=shop.get(restore);
						shop.put(restore, c+1);
					}
					
				}
				
				throw new MissingProductException();
				
			}
		}
		
		rimossi.clear();
		
	}
}