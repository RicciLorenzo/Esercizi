package palestra;

public class Utente implements Comparable<Utente> {
	//... 
	private String nome;
	private String cognome;
	
	public Utente(String nome, String cognome) { 
		//... 
		this.nome=nome;
		this.cognome=cognome;
	} 
	
	public boolean equals(Object other) { 
		//devono avere stesso nome e stesso cognome 
		Utente altro=null;
		if(other instanceof Utente)
			altro=(Utente)other;
		
		return this.nome==altro.nome&&this.cognome==altro.cognome;
		
	} 
	
	public int hashCode() {
		//non deve essere banale 
		return this.nome.hashCode()^this.cognome.hashCode();
	} 
	
	public int compareTo(Utente other) {
		//li mette in ordine per cognome e poi per nome 
		int diff;
		
		diff=this.cognome.compareTo(other.cognome);
		
		if(diff==0)
			diff=this.nome.compareTo(other.nome);
		
		return diff;
		
	} 
	
	public String toString() { 
		//ritorna il nome, uno spazio e il cognome 
		
		String result="";
		
		result=this.nome+" "+this.cognome;
		
		return result;
	} 
}
