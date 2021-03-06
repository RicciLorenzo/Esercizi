package pizza;

import java.util.SortedSet;
import java.util.TreeSet;

public class ProsciuttoFunghi extends AbstractPizza {

	final static ProsciuttoFunghi INSTANCE = new ProsciuttoFunghi();
	public ProsciuttoFunghi() {
		
	}
	
	@Override
	public int getPrice() {
		
		return 8;
	}
	
	@Override
	public SortedSet<String> getIngredienti() {
		
		SortedSet<String> ingr = new TreeSet<>();
		ingr.add("tomato");
		ingr.add("mozzarella");
		ingr.add("mushrooms");
		ingr.add("ham");
		
		return ingr;
	}
	
	@Override
	public String toString() {
		return "ProsciuttoFunghi";
	}
	
}
