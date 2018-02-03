package palestra;

public class Iscrizione implements Comparable<Iscrizione> { 
	//... 
	Utente utente;
	Mese meseInizio;
	int annoInizio;
	Mese meseFine;
	int annoFine;
	
	public Iscrizione(Utente utente, Mese meseInizio, int annoInizio, Mese meseFine, int annoFine) throws IscrizioneTroppoLungaException, IscrizioneVuotaException { 
		//... se il mese di inizio viene cronologicamente dopo il mese di fine, lancia una IscrizioneVuotaException 
		//se l’iscrizione va oltre i 12 mesi, lancia una IscrizioneTroppoLungaException 
		
		if(meseInizio.compareTo(meseFine)>0)
			throw new IscrizioneVuotaException();
		if(annoInizio<annoFine) {
			int inizio = meseInizio.ordinal();
			int fine = meseFine.ordinal();
			
			Mese[] mesi= meseInizio.values();
		}
		
		this.utente=utente;
		this.meseInizio=meseInizio;
		this.annoInizio=annoInizio;
		this.meseFine=meseFine;
		this.annoFine=annoFine;
		
	}
	
	public Utente getUtente() { 
		//ritorna l’utente che si e’ iscritto 
		return this.utente;
	} 
	
	public boolean equals(Object other) { 
		//devono avere stesso utente, stesso inizio e stessa fine 
		Iscrizione altro=null;
		if(other instanceof Iscrizione) 
			altro=(Iscrizione)other;
				
		if(this.utente==altro.utente&&this.meseInizio==altro.meseInizio&&this.annoInizio==altro.annoInizio&&this.meseFine==altro.meseFine&&this.annoFine==altro.annoFine)
			return true;
		else
			return false;
		
	} 
	
	public int hashCode() {
		//non deve essere banale 
		
		return this.utente.hashCode()^this.meseInizio.hashCode()^this.annoInizio^this.meseFine.hashCode()^this.annoFine;
		
	} 
	
	public int compareTo(Iscrizione other) {
		//li mette in ordine per inizio. A parita’ di inizio, li mette in ordine per utente. 
		//A parita’ di inizio e di utente, li mette in ordine per fine 
		
		
		if(this.annoInizio>other.annoInizio)
			return 1;
		else if(this.annoInizio<other.annoInizio)
			return -1;
		else{
			if(this.meseInizio.compareTo(other.meseInizio)!=0)
				return this.meseInizio.compareTo(other.meseInizio);
			else {
				if(this.utente.compareTo(other.utente)!=0)
					return this.utente.compareTo(other.utente);
				else {
						
					if(this.annoFine>other.annoFine)
						return 1;
					else if(this.annoFine<other.annoFine)
						return -1;
					else
						return this.meseFine.compareTo(other.meseFine);

				}
			}
				
		}
		
		
	} 
	
	public String toString() { 
		//ritorna una stringa del tipo: "Fausto Spoto: dall’inizio di SETTEMBRE 2014 alla fine di GENNAIO 2015" 
		
		String result;
		result=this.utente.toString()+": dall'inizio di "+this.meseInizio+" "+this.annoInizio+" Alla fine di "+this.meseFine+" "+this.annoFine;
		return result;
	} 
	
	public boolean sovrappostaCon(Iscrizione other) { 
		//determina se this e other sono sovrapposte nel tempo (anche parzialmente) 
	} 
	
	public int costo() { 
		//ritorna il costo dell’iscrizione: per 1 o 2 mesi costa 50 euro al mese, da 3 a 5 mesi costa 40 euro al mese, 
		//da 6 a 11 mesi costa 35 euro al mese, per 12 mesi costa 30 euro al mese
	} 
	
	public boolean relativaAl(int anno) {
		//determina se e’ relativa all’anno indicato, anche parzialmente
		if(this.annoInizio==anno||this.annoFine==anno)
			return true
		
		return false;
	}
	
	
}
