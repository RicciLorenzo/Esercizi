package time;

public abstract class Cartellone implements Iterable<Train>{

	
	
	@Override 
	public final String toString() {
		//... ritorna la concatenazione del toString() di tutti i treni nel cartellone 
		
		String risultato="";
		
		for(Train treno : this) {
			risultato+=treno.toString()+"\n";
		}
		
		return risultato;
		
	}
	
}



//probabilmente devo sfruttare qualcosa che non conosco.... eh immaginavo.... boh ok... aspetta ripeti l'ultima.. eh boh non so... dimmi te lol.. ok.. si ho capito.... ok
//si ma... il cartellone non é pieno.. o sbaglio? mmhm ok. va bene.. si si va bvene.. 

//ALLE 2 STREAMMO LOL MUOVERSI A FINIRE OMG SAMA
