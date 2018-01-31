package rubrica;

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
		private Entry next=null;
		
		private SexViewIterator() {
			iteratore=parent.iterator();
			
			//next=null;
			while(iteratore.hasNext()) {
				Entry temp = iteratore.next();
				if(temp.sex==sex) {
				next=temp;
				break;
				}
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
			
			next=null;
			while(iteratore.hasNext()) {
				Entry temp = iteratore.next();
				if(temp.sex==sex) {
					next = temp;
					break;
				}
			}
			
			return result;
			
		}
		
	}
}