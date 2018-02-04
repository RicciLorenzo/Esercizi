package palestra;

import java.util.SortedSet; 
import java.util.TreeSet;

public class Registro { 
	
	private final SortedSet<Iscrizione> iscrizioni = new TreeSet<Iscrizione>();
	
	public void aggiungi(Iscrizione iscrizione) throws IscrizioneSovrappostaException { 
		//aggiunge l’iscrizione indicata al registro. Se ne e’ gia’ presente una sovrapposta e per lo stesso utente, 
		//lancia una IscrizioneSovrappostaException 
		
		for(Iscrizione reg : iscrizioni) {
			if(reg.utente==iscrizione.utente) {
				if(reg.sovrappostaCon(iscrizione)) {
					throw new IscrizioneSovrappostaException();
				}
			}
		}
			
		
		iscrizioni.add(iscrizione);
		
	}
	
	public String toString() { 
		//ritorna la stringa delle iscrizioni di questo registro, in ordine, riportando il costo accanto a ciascuna iscrizione
		
		String result="";
		
		for(Iscrizione reg : iscrizioni) {
			result+=reg.toString()+reg.costo();
		}
		
		return result;
		
	}
	
	public Registro proiettaSu(int anno) throws IscrizioneSovrappostaException { 
		//ritorna un nuovo registro che contiene tutte e sole le iscrizioni di questo registro che riguardano l’anno indicato, 
		//anche parzialmente. Questo registro non viene modificato 
		
		TreeSet<Iscrizione> reg = new TreeSet<>();
		
		for(Iscrizione ctrl : iscrizioni) {
			if(ctrl.annoInizio==anno || ctrl.annoFine==anno)
				reg.add(ctrl);
		}
		
		Registro newRegistro = new Registro();
		
		for(Iscrizione ctrl : reg) {
			newRegistro.aggiungi(ctrl);
		}
		
		return newRegistro;
		
	}
	

}