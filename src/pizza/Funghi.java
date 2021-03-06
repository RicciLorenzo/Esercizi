package pizza;

import java.util.SortedSet;
import java.util.TreeSet;

public final class Funghi extends AbstractPizza {

	final static Funghi INSTANCE = new Funghi();
	private Funghi() {
		
	}
	
	@Override
	public int getPrice() {
		
		return 7;
	}

	@Override
	public SortedSet<String> getIngredienti() {
		SortedSet<String> ingr = new TreeSet<>();
		ingr.add("tomato");
		ingr.add("mozzarella");
		ingr.add("mushrooms");
		
		return ingr;
	}
	
	@Override
	public String toString() {
		return "Funghi";
	}

}