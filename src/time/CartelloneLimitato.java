package time;

import java.util.Iterator;

public class CartelloneLimitato extends Cartellone {

	int massimo;
	Cartellone c = new CartelloneModificabile();
	
	public CartelloneLimitato(Cartellone original, int max) {
		this.massimo=max;
		this.c=original;
	}

	
	@Override
	public Iterator<Train> iterator() {
		// TODO Auto-generated method stub
		//...ritorna un iteratore sui primi max treni di original (al massimo)
		
		return new Iterator<Train>(){
			
			private int c; 
			private Iterator<Train> iteratore=c.iterator(); 
			
			public boolean hasNext() {
				
			}
			
		}; 
	}

	
	
}
