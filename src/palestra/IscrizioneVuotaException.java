package palestra;

public class IscrizioneVuotaException extends Exception {
	public IscrizioneVuotaException(){
		super("ERRORE: Mese di inizio iscrizione superiore al mese di fine iscrizione.");
	}
}
