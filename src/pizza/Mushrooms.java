package pizza;

import java.util.SortedSet;

public final class Mushrooms extends AbstractPizza {

	final static Mushrooms INSTANCE = new Mushrooms();
	private Mushrooms() {
		
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SortedSet<String> getIngredienti() {
		// TODO Auto-generated method stub
		return null;
	}

}
