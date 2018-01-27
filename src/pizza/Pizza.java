package pizza;

import java.util.SortedSet;

public interface Pizza extends Comparable<Pizza> {

	public int getPrice();
	public SortedSet<String> getIngredienti();
		
}