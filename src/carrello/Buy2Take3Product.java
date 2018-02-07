package carrello;

public class Buy2Take3Product extends Product {
	//... 
	Product original;
	
	public Buy2Take3Product(Product original) {
		//... deve lanciare una IllegalArgumentException se original non puo’ essere scontato
		super(original);

		if(!original.canBeReduced())
			throw new IllegalArgumentException();
		
		this.original=original;
		
	}
	
	@Override 
	public boolean canBeReduced() {
		//... non puo’ essere scontato!
		
		return false;
		
	} 
	
	@Override 
	public double getPrice(Cart cart) {
		//... tenete conto di quanti altri prodotti uguali (==) ci sono nel carrello 
		
		int c=0;
		double tot;
		
		for(Product product : cart) {
			if(product==this)
				c++;
		}
		tot=original.getPrice(cart)*c;
		if(c>3) {
			tot=original.getPrice(cart)*(c-(c/3));
		}
		
		return tot/c;
		
	}
}
