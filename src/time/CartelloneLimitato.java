package time;

import java.util.Iterator;

public class CartelloneLimitato extends Cartellone {

	int massimo;
	Cartellone cart;
	
	public CartelloneLimitato(Cartellone original, int max) {
		this.massimo=max;
		this.cart=original;
	}

	
	@Override
	public Iterator<Train> iterator() {
		// TODO Auto-generated method stub
		//...ritorna un iteratore sui primi max treni di original (al massimo)
		
		return new Iterator<Train>(){
			
					private int c; 
					private Iterator<Train> iteratore=cart.iterator(); 
			
					public boolean hasNext() {
						if(iteratore.hasNext() && c<massimo) {
							return true;
						}
						else
							return false;
					}
					
					public Train next() {
						c++;
						return iteratore.next();
					}
			
				}; 
	}

	
	
}
