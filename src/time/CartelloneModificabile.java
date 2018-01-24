package time;

import java.util.Iterator;
import java.util.TreeSet;

public class CartelloneModificabile extends Cartellone {

	TreeSet<Train> treni = new TreeSet<Train>(); 
	
	
	public CartelloneModificabile() {
		
	} 
	
	public void add(Train train) {
		//...aggiunge train a questo cartellone 
		
		this.treni.add(train);
		
	} 
	
	public void add(Iterable<Train> trains) {
		//...aggiunge tutti i trains a questo cartellone 
		
		for(Train cani : trains) {
			this.treni.add(cani);
		}
		
	}
	
	//UGUALI
	public void add(Train... trains) {
		//...aggiunge tutti i trains a questo cartellone 
		
		for(Train cani : trains) {
			this.treni.add(cani);
		}
		
	}
	
	//cazzo é...
	
	@Override
	public Iterator<Train> iterator() {
		// TODO Auto-generated method stub
		//...ritorna un iteratore sui trains di questo cartellone
		
		
		return treni.iterator();
		
	}

	
	
}

//non capisco la differenza fra i secondi due add... ora? eh ma non so bene come si fa... non c'é