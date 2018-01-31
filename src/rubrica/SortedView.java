package rubrica;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Arrays;

import rubrica.PhoneBook.Entry;

public class SortedView extends View { 
	private final View parent; 
	private final Comparator<Entry> comparator;
	
	public SortedView(View parent, Comparator<Entry> comparator) { 
		this.parent = parent; 
		this.comparator = comparator; 
	}
	
	@Override 
	public Iterator<Entry> iterator() {
		
		return new SortedViewIterator();
		
	}
	
	private class SortedViewIterator implements Iterator<Entry> {
		
		private Iterator<Entry> iteratore = parent.iterator();
		private Entry[] sortedEntries;
		private Entry next;
		
		private SortedViewIterator() {
			final ArrayList<Entry> sorted = new ArrayList<>();
			for(Entry contatto : parent) {
				sorted.add(contatto);
			}
			
			sortedEntries=sorted.toArray(new Entry[sorted.size()]);
			Arrays.sort(sortedEntries,comparator);
			
		}

		@Override
		public boolean hasNext() {
			if(iteratore.next() != null)
				return true;
			else
				return false;
		}

		
		@Override
		public Entry next() {
			if(iteratore.hasNext()) {
				next=iteratore.next();
				return next;
			}
			
			return next;
		}
		
		
	}
	
}