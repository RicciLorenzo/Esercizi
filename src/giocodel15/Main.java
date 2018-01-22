package giocodel15;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Gioco15 prova = new Gioco15();
		System.out.println(prova.toString());
		
		int x,y;		
		System.out.println("Inserisci le due coordinate delle caselle: ");
		
		Scanner casella = new Scanner(System.in);
		x=casella.nextInt();
		y=casella.nextInt();
		casella.close();
		
		prova.sposta(x, y);
		
		System.out.println("\nGriglia finale:");
		System.out.println(prova.toString());
		
		
	}
	
}
