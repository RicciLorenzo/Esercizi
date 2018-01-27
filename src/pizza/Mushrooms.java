package pizza;

import java.util.SortedSet;
import java.util.TreeSet;

public final class Mushrooms extends AbstractPizza {

	final static Mushrooms INSTANCE = new Mushrooms();
	private Mushrooms() {
		
	}
	
	@Override
	public int getPrice() {
		
		return 7;
	}

	@Override
	public SortedSet<String> getIngredienti() {
		SortedSet<String> ingr = new TreeSet<>();
		ingr.add("Tomato");
		ingr.add("Mozzarella");
		ingr.add("Mushrooms");
		
		return ingr;
	}

}