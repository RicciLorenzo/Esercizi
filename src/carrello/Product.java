package carrello;

public class Product { 
	
	private String seller;
	private String name;
	private double price;
	

	public Product(String seller, String name, double price) {
		this.seller=seller;
		this.name=name;
		this.price=price;
	} 
	
	protected Product(Product original) {
		//... crea una copia di original
		
		this.seller=original.seller;
		this.name=original.name;
		this.price=original.price;
		
	} 
	
	public final String getSeller() { 
		//...restituisce seller 
		
		return seller;
		
	} 
	
	public final String getName() { 
		//...restituisce name
		
		return name;
		
	} 
	
	public double getPrice(Cart cart) {
		//...restituisce price
		
		return price;
		
	}
	
	public boolean canBeReduced() {
		//... tutti i prodotti possono essere scontati meno il 3 per 2
		
		return true;
		
	} 
	
	@Override 
	public String toString() { 
		return getName(); 
	}
} 