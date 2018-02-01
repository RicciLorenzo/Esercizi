package negozio2;

public class MissingProductException extends Exception {

	public MissingProductException() {
		super("Prodotti non disponibili in magazzino.");
	}
}
