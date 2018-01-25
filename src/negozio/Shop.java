package negozio;

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
		
		/*if(productsList.contains(productsToBuy)) {
			for(int k=0;k<c;k++) {
				if(productsToBuy[k] !=null)
					productsList.remove(productsToBuy);
				else
					break;
				
			}
			
		}*/
		
		else
			throw new MissingProductException();
		
		
	}
	
}