package rubrica;

import java.util.Comparator;

import rubrica.PhoneBook.Entry;
import rubrica.PhoneBook.Entry.*;

public class Main {
	public static void main(String[] args) throws UnknowEntryException { 
		
		PhoneBook book = new PhoneBook();
		book.add("Primo", "Levi", 7569222, false); 
		book.add("Fausto", "Spoto", 1234567, false); 
		book.add("Giorgio", "Levi", 1563423, false); 
		book.add("Catherine", "Bach", 367745, true);
		book.add("Pietro", "Ferrara", 7865634, false); 
		book.add("Alberto", "Lovato", 8746728, false); 
		book.add("Thomas", "Scudiero", 453678, false); 
		book.add("Pietro", "Ferrara", 333334, false); // sostituisce 
		book.add("Cybill", "Shepherd", 987567546, true); 
		book.add("Audrey", "Hepburn", 32444, true); 
		book.remove("Fausto", "Spoto");
		
		View view = book; 
		System.out.println("DIRECT VIEW"); 
		System.out.println(view);
		view = new SexView(view, false); 
		System.out.println("MALE ONLY VIEW"); 
		System.out.println(view);
		Comparator<Entry> comparator = new Comparator<Entry>() { // ordina per cognome e poi per nome
			@Override 
			public int compare(Entry address1, Entry address2) { 
				int diff = address1.surname.compareTo(address2.surname); 
				if (diff != 0) 
					return diff; 
				else 
					return address1.name.compareTo(address2.name); 
			} 
		};
			view = new SortedView(view, comparator); System.out.println("SORTED MALE ONLY VIEW"); System.out.println(view);
	}
}
