package pizza;

import java.util.SortedSet;
import java.util.TreeSet;

public class PizzaWithout extends AbstractPizza {

	Pizza base;
	String removeIngredient;
	int extraPrice;
	
	// costruisce la pizza ottenuta da base aggiungendo l’ingrediente indicato, che costa
	// il prezzo extra indicato. Se l’ingrediente era gia’ fra quelli della pizza base, 
	// deve lanciare un’eccezione di classe IllegalPizzaModificationException public PizzaWith(Pizza base, String addedIngredient, int extraPrice) { ... }

	public PizzaWithout(Pizza base, String removeIngredient, int extraPrice) throws IllegalPizzaModificationException {
		if(!(base.getIngredienti().contains(removeIngredient)))
			throw new IllegalPizzaModificationException();
		this.base=base;
		this.removeIngredient=removeIngredient;
		this.extraPrice=extraPrice;
	}
	
	@Override 
	public String toString() {
		//... ritorna il toString() di base concatenato con "with" e l’ingrediente aggiunto 
		
		return base.toString()+"... Elemento eliminato: "+this.removeIngredient;
	}
	
	@Override 
	public int getPrice() {
		//... ha il prezzo di base piu’ il prezzo extra da aggiungere 
		
		return base.getPrice()-extraPrice;
	}

	@Override
	public SortedSet<String> getIngredienti() {
		//... ha gli ingredienti di base piu’ quello aggiunto
		SortedSet<String> ingr = new TreeSet<>();
		ingr = base.getIngredienti();
		ingr.remove(removeIngredient);
		
		return ingr;
	}
	
}
