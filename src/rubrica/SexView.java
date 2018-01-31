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
		private Entry entry;
		
		private SexViewIterator() {
			iteratore=parent.iterator();
			if(iteratore.next().sex==sex)
				entry=iteratore.next();
		}
		
		@Override
		public boolean hasNext() {
			
			if(entry!=null)
				return true;
			else
				return false;
			
		}

		@Override
		public Entry next() {
			Entry result = entry;
			
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