package carrello;

public class DiscountedProduct extends Product {
	//... 
	Product original;
	double discount;
	
	public DiscountedProduct(Product original, double discount) {
		//... deve lanciare una IllegalArgumentException se original non puo’ essere scontato 
		super(original);

		if(!original.canBeReduced())
			throw new IllegalArgumentException();
		
		this.original=original;
		this.discount=discount;
	}
	
	
	@Override 
	public double getPrice(Cart cart) {
		//... si tenga conto dello sconto da applicare al prezzo del prodotto original
		
		double temp=original.getPrice(cart)-((original.getPrice(cart)*discount)/100);
		
		return temp;
		
	} 
	
	@Override
	public String toString() { 
		//... si aggiunga "[scontato del XX%]" in fondo alla stampa di original 
		
		String result=original.toString();
		result+=" [scontato del "+discount+"%]";
		
		return result;
		
	}
}
