package negozio;

public abstract class Order {

	private final Shop shop; // il negozio a cui si passa l’ordine 
	private final Product[] products; // i prodotti che si vuole acquistare in tale negozio
	
	protected Order(Shop shop, Product... products) {
		this.shop = shop; 
		this.products = products;
	}
	
	protected final Product[] getProducts() { 
		
		return products; 
		
	}
	
	// acquista i prodotti di questo ordine, andando in eccezione se non sono tutti disponibili in negozio
	protected final void buy() throws MissingProductException {
		shop.buy(products); 
	}
	
	// acquista i prodotti di questo ordine, andando in eccezione se non sono tutti disponibili in negozio, 
	// e ritorna le spedizioni da fare per inviarli 
	public abstract Iterable<Shipping> ship() throws MissingProductException;
	
}
