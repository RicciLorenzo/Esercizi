package rubrica;

import rubrica.PhoneBook.Entry;

public abstract class View implements Iterable<Entry> {
	
	protected View() {
		
	}
	
	@Override
	public final String toString() {
		String result = ""; 
		for (Entry entry: this)
			result += entry.toString() + "\n";
		
	return result;
	}
	
}