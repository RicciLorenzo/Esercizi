package tempoit;

import java.util.Iterator;
import java.util.TreeSet;

public class CartelloneModificabile extends Cartellone {
	//... 
	TreeSet<Train> treni = new TreeSet<>();
	
	public CartelloneModificabile() {} 
	
	public void add(Train train) { 
		//...aggiunge train a questo cartellone 
		treni.add(train);
	} 
	
	public void add(Iterable<Train> trains) {
		//...aggiunge tutti i trains a questo cartellone 
		for(Train train : trains) {
			treni.add(train);
		}
	}
	
	public void add(Train... trains) {
		//...aggiunge tutti i trains a questo cartellone 
		for(Train train : trains) {
			treni.add(train);
		}
	}
	
	@Override 
	public Iterator<Train> iterator() { 
		//...ritorna un iteratore sui trains di questo cartellone 
		
		return treni.iterator();
		
	}
} 