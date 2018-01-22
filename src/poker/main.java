package poker;
import java.util.concurrent.ThreadLocalRandom;

public class main {
	
	public static void main(String[] args) {
		
		int min=1;
		
		/*card carta = new card(13);	
		System.out.println("CARTA DA GIOCO: \n");
		System.out.println("Numero: " + carta.getValue()); 
		System.out.println("n° Seme: " + carta.getSuit());
		System.out.println("Simbolo: " + carta.seme);
		System.out.println("CARTA: " + carta.toString());
		card other = new card(13);
		System.out.println("\nCreo una nuova carta da gioco random.\nLa carta da gioco nuova è: " + other.toString() + "\nControllo se le due carte da gioco sono uguali: ");
		
		if(carta.equals(other)) {
			System.out.println("\nSono uguali!");
		}
		else
			System.out.println("\nNon sono uguali!");*/
			
		hand mano = new hand(min);
		/*mano.carta1.modifyValue(1);
		mano.carta2.modifyValue(1);
		mano.carta3.modifyValue(1);
		mano.carta4.modifyValue(10);
		mano.carta5.modifyValue(10);*/
		System.out.println(mano.toString());
		System.out.println(mano.category());
		
		double cartaalta=0;
		double coppia=0;
		double tris=0;
		double dcoppia=0;
		double full=0;
		double flush=0;
		double straight=0;
		double cstraight=0;
		double rstraight=0;
		double poker=0;
		double totale=0;
		
		for(int contatore=0;contatore<500000;contatore++) {
			
			hand estrazione = new hand(min);
			System.out.println(estrazione.toString());
			
			if(estrazione.category().contains("Carta alta:"))
				cartaalta++;
			if(estrazione.category()=="Pair")
				coppia++;
			if(estrazione.category()=="Tris")
				tris++;
			if(estrazione.category()=="Double pair")
				dcoppia++;
			if(estrazione.category()=="Full House")
				full++;
			if(estrazione.category()=="Flush")
				flush++;
			if(estrazione.category()=="Straight")
				straight++;
			if(estrazione.category()=="Color Straight")
				cstraight++;
			if(estrazione.category()=="Royal Straight")
				rstraight++;
			if(estrazione.category()=="Poker")
				poker++;
			
			totale++;
			
		}
		
		System.out.print("Percentuale di carte alte: ");
		System.out.println((100*cartaalta)/totale);
		System.out.println("Carte alte: "+cartaalta);
		
		System.out.print("Percentuale di coppie: ");
		System.out.println((100*coppia)/totale);
		System.out.println("Coppie: "+coppia);
		System.out.print("Percentuale di tris: ");

		System.out.println((100*tris)/totale);
		System.out.println("Tris: "+tris);
		System.out.print("Percentuale di doppie coppie: ");

		System.out.println((100*dcoppia)/totale);
		System.out.println("Doppie Coppie: "+dcoppia);
		System.out.print("Percentuale di full: ");

		System.out.println((100*full)/totale);
		System.out.println("Full: "+full);
		System.out.print("Percentuale di flush: ");

		System.out.println((100*flush)/totale);
		System.out.println("Flush: "+flush);
		System.out.print("Percentuale di scale: ");

		System.out.println((100*straight)/totale);
		System.out.println("Scale: "+straight);
		System.out.print("Percentuale di scale colore: ");

		System.out.println((100*cstraight)/totale);
		System.out.println("Scale colore: "+cstraight);
		System.out.print("Percentuale di scale reali: ");

		System.out.println((100*rstraight)/totale);
		System.out.println("Scale reali: "+rstraight);
		System.out.print("Percentuale di poker: ");

		System.out.println((100*poker)/totale);
		System.out.println("Poker: "+poker);
		/*System.out.print("Percentuale del resto: ");
		System.out.println((100*(totale-coppia)/totale));*/
		
	}
}
