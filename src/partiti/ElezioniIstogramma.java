package partiti;

import java.util.HashMap;

public class ElezioniIstogramma extends Elezioni { 
	//...
	
	HashMap<Partito, Integer> elezioni = new HashMap<>();
	
	
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
			result+=partito.indice()+"\t"+partito.name()+": "+votiPer(partito)+" "+((votiPer(partito)*100)/numeroVotiEspressi())+"\n";
		}
		result+="\n\n";
			
		for(Partito partito :elezioni.keySet() ) {
			int temp=0;
			int voti=(votiPer(partito)*100)/numeroVotiEspressi();
			temp=((50*voti)/100);
			for(int c=0;c<temp;c++) {
				result+=partito.indice();
			}
					
		}
		
		return result;
		
	}
}