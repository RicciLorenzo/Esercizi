package palestra;

public class IscrizioneTroppoLungaException extends Exception{

	public IscrizioneTroppoLungaException() {
		super("ERRORE: L'iscrizione supera il periodo massimo di 12 mesi.");
	}
	
}
