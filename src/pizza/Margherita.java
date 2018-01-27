package pizza;

import java.util.SortedSet;
import java.util.TreeSet;

public final class Margherita extends AbstractPizza {
	
	final static Margherita INSTANCE = new Margherita(); // unico oggetto esistente private Margherita() {}
	//.. stampandola si ottiene "Margherita", i suoi ingredienti sono "tomato" e "mozzarella", il costo 5 euro
	
	private Margherita() {
		
	}
	
	@Override
	public int getPrice() {
		return 5;
	}
	
	@Override
	public SortedSet<String> getIngredienti(){
		SortedSet<String> ingr = new TreeSet<String>();
		ingr.add("Tomato");
		ingr.add("Mozzarella");
		
		return ingr;
	}
	
	@Override
	public String toString() {
		return "Margherita";
	}
	
}
