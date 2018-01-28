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
		ingr.add("mozzarella");
		ingr.add("parmesan");
		ingr.add("gorgonzola");
		
		return ingr;
	}

	@Override
	public String toString() {
		return "Formaggi";
	}
	
}