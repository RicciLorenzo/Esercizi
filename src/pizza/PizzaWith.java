package pizza;

import java.util.SortedSet;
import java.util.TreeSet;

public class PizzaWith extends AbstractPizza {
	
	private final Pizza base;
	private final String addIngredient;
	private final int extraPrice;
	
	// costruisce la pizza ottenuta da base aggiungendo l’ingrediente indicato, che costa
	// il prezzo extra indicato. Se l’ingrediente era gia’ fra quelli della pizza base, 
	// deve lanciare un’eccezione di classe IllegalPizzaModificationException public PizzaWith(Pizza base, String addedIngredient, int extraPrice) { ... }

	public PizzaWith(Pizza base, String addIngredient, int extraPrice) {
		if(base.getIngredienti().contains(addIngredient))
			throw new IllegalPizzaModificationException();
		
		this.base=base;
		this.addIngredient=addIngredient;
		this.extraPrice=extraPrice;
	}
	
	@Override 
	public String toString() {
		//... ritorna il toString() di base concatenato con "with" e l’ingrediente aggiunto 
		
		return base.toString()+"... Elemento aggiunto: "+this.addIngredient;
	}
	
	@Override 
	public int getPrice() {
		//... ha il prezzo di base piu’ il prezzo extra da aggiungere 
		
		return base.getPrice()+extraPrice;
	}

	@Override
	public SortedSet<String> getIngredienti() {
		//... ha gli ingredienti di base piu’ quello aggiunto
		SortedSet<String> ingr = new TreeSet<>();
		ingr = base.getIngredienti();
		ingr.add(addIngredient);
		
		return ingr;
	}

}