package pizza;

import java.util.SortedSet;
import java.util.TreeSet;

public final class Formaggi extends AbstractPizza {
	
	final static Formaggi INSTANCE = new Formaggi();
	private Formaggi() {
		
	}
	
	@Override
	public int getPrice() {
		return 8;
	}

	@Override
	public SortedSet<String> getIngredienti() {
		//mozzarella, parmesa, gorgonzola
		SortedSet<String> ingr = new TreeSet<>();
		ingr.add("Mozzarella");
		ingr.add("Parmesan");
		ingr.add("Gorgonzola");
		
		return ingr;
	}

}