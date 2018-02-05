package partiti;

import java.util.HashMap;

public class Elezioni { 
	//...
	
	HashMap<Partito, Integer> elezioni = new HashMap<>();
	
	public void vota(Partito partito) { 
		//...registra un altro voto per il partito indicato 
		int temp = elezioni.get(partito);
		elezioni.put(partito, temp++);
	}
	
	@Override 
	public String toString() { 
		//...sulla base dei voti registrati per ciascun partito, restituisce una stringa del tipo:
		//Risultati elezioni:
		//1 PENSIONATI: 7762 voti (33.03%) 2 FELICE: 3216 voti (13.68%) 3 FLOREALE: 5695 voti (24.23%) 4 CAOTICO: 5731 voti (24.39%) 5 BASSOTTI: 1098 voti (4.67%)
		
		
		
	}
	
	protected final int numeroVotiEspressi() { 
		//...restituisce il numero totale di voti registrati 
	}
	
	protected final int votiPer(Partito partito) {
		//...restituisce il numero totale di voti registrati per il partito indicato 
	}

}