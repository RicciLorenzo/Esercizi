package rubrica;

import java.util.Comparator;
import java.util.Iterator;

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
		
		return null;
		
	}
	
}