package pizza;


public abstract class AbstractPizza implements Pizza {
	
	@Override
	public boolean equals(Object other) {
		Pizza pizza;
		if(other instanceof Pizza)
			pizza=(Pizza)other;
		else
			return false;
		
		if(getPrice()==pizza.getPrice()) {
			if(getIngredienti()==pizza.getIngredienti()) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public final int hashCode() {
		
		return getIngredienti().hashCode();
		
	}
	
	@Override
	public final int compareTo(Pizza other) {
		
		return getPrice()-other.getPrice();
		
	}
	
	@Override
	public String toString() {
		
		return "PIZZA\n "+". Prezzo: "+getPrice()+". Ingredienti: "+getIngredienti(); 
		
	}
	
}