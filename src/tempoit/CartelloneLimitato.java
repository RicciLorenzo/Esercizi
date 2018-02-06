package tempoit;

import java.util.Iterator;

public class CartelloneLimitato extends Cartellone {
	//... 
	Cartellone original;
	int max;
	
	public CartelloneLimitato(Cartellone original, int max) {
		this.original=original;
		this.max=max;
	}
	
	@Override 
	public Iterator<Train> iterator() {
		//...ritorna un iteratore sui primi max treni di original (al massimo)
		
		return new trainIterator();
		
	}
	
	private class trainIterator implements Iterator<Train>{
		
		int c=0;
		Iterator<Train> cartelloneIterator = original.iterator();
		
		@Override
		public boolean hasNext() {
			
			if(c<max) {
				if(cartelloneIterator.hasNext())
					return true;
			}
			
			return false;
				
		}
		
		@Override
		public void remove() {}

		@Override
		public Train next() {
			if(c<max) {
				c++;
				return cartelloneIterator.next();
			}
			
			return null;
		}
		
	}
}