package pizza;

public class IllegalPizzaModificationException extends RuntimeException {

	public IllegalPizzaModificationException() {
		super("Modifica impossibile");
	}
	
}
