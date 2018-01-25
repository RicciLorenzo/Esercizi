package negozio;

public class SplitOrder extends Order {
	
	public SplitOrder(Shop shop, Product... products) {
		super(shop,products);
	} 
	
	@Override 
	public Iterable<Shipping> ship() throws MissingProductException {
		//...compra i prodotti e ritorna una o piu’ spedizioni 
		
		this.buy();
		
	} 
	
}