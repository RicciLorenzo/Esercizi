package doodle;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashMap;

public class Doodle {
	// una mappa che al nome di ciascun partecipante associa l’insieme (non ordinato) 
	// degli slot temporali in cui e’ disponibile 
	private final Map<String, Set<Slot>> availabilities = new HashMap<>();
	
	// prendono nota che un partecipante e’ disponibile in certi slot 
	public void available(String name, Slot... when) {
		//availabilities.put(name, (Set<Slot>) Arrays.asList(when));
		
		Set<Slot> ava = new TreeSet<>();
		for(Slot slot : when)
			ava.add(slot);
		
		availabilities.put(name, ava);
	} 
	
	public void available(String name, Iterable<Slot> when) {
		
		availabilities.put(name,(Set<Slot>) when);
		
	}
	
	// restituisce una stringa che descrive il doodle, come nell’esempio nella pagina seguente; si noti 
	// che gli slot sono presentati in ordine crescente e i nomi dei partecipanti in ordine alfabetico 
	public String toString() {
		String result = "";
		// mette in slots tutti gli slot temporali di tutti i partecipanti, ordinati in senso crescente 
		SortedSet<Slot> slots = new TreeSet<>(); 
		for (Set<Slot> set: availabilities.values()) 
			slots.addAll(set);
		
		//...
		//result=slots.toString();
		result="\n";
		for(Slot slot : slots) {
			result+=slot.toString()+"		";
		}
		result+="\n";
		//result+="cacca				cane				pane				lol";
		
		for(String name : availabilities.keySet()) {
			for(Slot slot : slots) {
				if(availabilities.get(name).contains(slot))
					result+="Si				";
				else
					result+="No				";
			}
			result+=name;
			result+="\n";
		}
		
		
		double max=0;
		boolean made=false;
		for(Slot slot : slots) {
			double tot=0;
			for(String name : availabilities.keySet()) {
				if(availabilities.get(name).contains(slot))
					tot+=this.weightOf(name);
			}
			if(tot>max)
				max=tot;
		}
		
		for(Slot slot : slots) {
			double tot=0;
			for(String name : availabilities.keySet()) {
				if(availabilities.get(name).contains(slot))
					tot+=this.weightOf(name);
			}
			
			if(tot==max && !made) {
				result+=tot+"*				";
				made=true;
			}
			else
				result+=tot+"				";
		}
			
		
		return result+="\n";
	}
	
	// restituisce il peso (importanza) della presenza del partecipante indicato; 
	// in questa implementazione, tutti i partecipanti hanno lo stesso peso (1.0) 
	protected double weightOf(String name) {
		return 1.0; 
	}

}