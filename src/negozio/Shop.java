package negozio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
	private final Map<Product, Integer> products = new HashMap<>();

	public void add(Product product, int howMany) {
		products.putIfAbsent(product, 0);
		products.put(product, products.get(product) + howMany);
	}

	void buy(Product[] productsToBuy) throws MissingProductException {
		List<Product> removed = new ArrayList<>();

		for (Product product: productsToBuy) {
			Integer available = products.get(product);
			if (available == null || available == 0) {
				// prima reinseriamo i prodotti che avevamo tolto
				for (Product toAdd: removed)
					products.put(toAdd, products.get(toAdd) + 1);

				// adesso possiamo abortire la transazione
				throw new MissingProductException();
			}

			removed.add(product);
			products.put(product, available - 1);
		}
	}
}


/*package negozio;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
	
	
	private ArrayList<Product> productsList = new ArrayList<Product>();
	
	public Shop(){
		
	}
	
	public void add(Product product, int howMany) {
		//...aggiunge howMany volte il prodotto indicato, che poteva gia’ essere presente in negozio
		
		
		while(howMany>0) {
			
			productsList.add(product);		
			howMany--;
			
		}
		
	}
	
	void buy(Product[] productsToBuy) throws MissingProductException {
		//...rimuove i prodotti indicati da quelli disponibili in questo negozio; 
		//se non fossero disponibili tutti i prodotti, lancia una MissingProductException; 
		//in tal caso, il negozio dovra’ restare immutato e nessun prodotto dovra’ venire tolto 
		
		int c=productsToBuy.length;

		ArrayList<Product> p = new ArrayList<>(Arrays.asList(productsToBuy));
		
		
		if(productsList.containsAll(p))
			productsList.removeAll(p);
		else
			throw new MissingProductException();
		
		
	}
	
}*/