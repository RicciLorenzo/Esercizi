package rubrica;

import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBook extends View { 
	
	ArrayList<Entry> rubrica = new ArrayList<>();
	
	public static class Entry {
	public final String name; 
	public final String surname; 
	public final int phone; 
	public final boolean sex; 
	public final static boolean MALE = false, FEMALE = true;
	
	

	private Entry(String name, String surname, int phone, boolean sex) {
		this.name = name; 
		this.surname = surname; 
		this.phone = phone; 
		this.sex = sex; 
	}
	
	@Override
	public String toString() { 
		return name + " " + surname + ": " + phone + (sex == MALE ? " [male]" : " [female]"); 
	}
}


public void add(String name, String surname, int phone, boolean sex) {
	// aggiunge l’entry; se gia’ ne esisteva una con lo stesso nome e cognome, la sostituisce
	
	for(Entry contatto : rubrica) {
		if(contatto.name==name && contatto.surname==surname) {
			rubrica.remove(contatto);
			rubrica.add(new Entry(name,surname,phone,sex));
			return;
		}
	}
	
	rubrica.add(new Entry(name,surname,phone,sex));
	
}

public void remove(String name, String surname) {
	// rimuove l’entry con tale nome e cognome; se non e’ presente, lancia una UnknownEntryException
	
	for(Entry contatto : rubrica) {
		if(contatto.name==name && contatto.surname==surname) {
			rubrica.remove(contatto);
			return;
		}
	}
	
	throw new UnknowEntryException();
	
}

@Override public Iterator<Entry> iterator() {  
	// resituisce un iteratore sulle entry di questo PhoneBook
	
	return rubrica.iterator();
	
}

}