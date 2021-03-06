package partiti;

import java.util.HashMap;
import java.util.Iterator;

public class Elezioni implements Iterator<VotiPerPartito> { 
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
		//1	PENSIONATI: 7762 voti (33.03%) 
		//2 FELICE: 3216 voti (13.68%) 
		//3 FLOREALE: 5695 voti (24.23%) 
		//4 CAOTICO: 5731 voti (24.39%) 
		//5 BASSOTTI: 1098 voti (4.67%)
		
		String result="Risultati elezioni:\n";
		for(Partito partito :elezioni.keySet() ) {
			result+=partito.indice()+"\t"+partito.name()+": "+votiPer(partito)+" "+((votiPer(partito)*100)/numeroVotiEspressi());
		}
		
		return result;
		
	}
	
	protected final int numeroVotiEspressi() { 
		//...restituisce il numero totale di voti registrati 
		int tot=0;
		for(int voti : elezioni.values()) {
			tot+=voti;
		}
		return tot;
	}
	
	protected final int votiPer(Partito partito) {
		//...restituisce il numero totale di voti registrati per il partito indicato 
		return elezioni.get(partito);
	}
	
	@Override
	public final Iterator<VotiPerPartito> iterator(){
		
		return ElezioniIterator();
		
	}
	
	private class ElezioniIterator implements Iterator<VotiPerPartito> {

		int cursor=0;
		
		@Override
		public boolean hasNext() {
			if(cursor<Partito.NUMERO_PARTITI)
				return true;
			
			return false;
		}
	
		@Override
		public VotiPerPartito next() {
			Partito prossimoPartito = Partito.elementi()[cursor++];
			return new VotiPerPartito(prossimoPartito, elezioni.get(prossimoPartito));
		}
	}
}