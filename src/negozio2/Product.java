package negozio2;

public class Product { 
	private final String name; 
	private final double price; 
	private final int daysBeforeShipping;
	
	public Product(String name, double price, int daysBeforeShipping) { 
		this.name=name;
		this.price=price;
		this.daysBeforeShipping=daysBeforeShipping;
	}
	
	@Override 
	public String toString() {
		return String.format("%s: %.2f euros, available in %d days", name, price, daysBeforeShipping); 
	}
	
	@Override 
	public boolean equals(Object other) { 
		//...confronta tutti e tre i campi
		Product altro=null;
		if(other instanceof Product){
			altro=(Product)other;
		}
		
		return this.name.equals(altro.name)&&this.price==altro.price&&this.daysBeforeShipping==altro.daysBeforeShipping;
		
	} 
	
	@Override 
	public int hashCode() {
		
		return name.hashCode()^Double.valueOf(price).hashCode()^daysBeforeShipping;
		
	}
	
	public int getDaysBeforeShipping() {
		return daysBeforeShipping; 
	}
}