package rubrica;

import java.util.ArrayList;
import java.util.Iterator;

import rubrica.PhoneBook.Entry;

public class SexView extends View { 
	private final View parent; 
	private final boolean sex; 
	
	public SexView(View parent, boolean sex) { 
		this.parent = parent; 
		this.sex = sex; 
	} 
	
	@Override 
	public Iterator<Entry> iterator() {
		
		return new SexViewIterator();
		
	} 
	
	private class SexViewIterator implements Iterator<Entry>{

		private Iterator<Entry> iteratore;
		private Entry next;
		
		private SexViewIterator() {
			iteratore=parent.iterator();
			
			while(iteratore.hasNext()) {
				Entry temp = iteratore.next();
				if(temp.sex==sex)
					next=temp;
			}
			
		}
		
		@Override
		public boolean hasNext() {
			
			if(next!=null)
				return true;
			else
				return false;
			
		}

		@Override
		public Entry next() {
			Entry result = next;
			
			while(iteratore.hasNext()) {
				if(iteratore.next().sex==sex) {
					result = iteratore.next();
					return result;
				}
			}
			
			return result;
			
		}
		
	}
}