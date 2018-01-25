package negozio;

public class Product {

	private final String name; 
	private final double price; 
	private final int daysBeforeShipping;
	
	public Product(String name, double price, int daysBeforeShipping) {
		this.name=name;
		this.price=price;
		this.daysBeforeShipping=daysBeforeShipping;
	}
	
	@Override public String toString() {
		return String.format("%s: %.2f euros, available in %d days", name, price, daysBeforeShipping); 
	}
	
	@Override public boolean equals(Object other) {
		Product altro;
		if(other instanceof Product)
			altro=(Product)other;
		else
			return false;
		
		if(this.name==altro.name) {
			if(this.price==altro.price) {
				if(this.daysBeforeShipping==altro.daysBeforeShipping)
					return true;
			}
		}
		
		return false;
		
	} 
	
	@Override public int hashCode() {
		//...consistente con equals() e non banale
		return this.name.hashCode()^Double.valueOf(this.price).hashCode()^this.daysBeforeShipping;
	}
	
	public int getDaysBeforeShipping() {
		
		return daysBeforeShipping; 
		
	}

	
}
