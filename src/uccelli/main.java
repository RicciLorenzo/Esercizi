package uccelli;

import java.util.Scanner;

public class main {

	public static void main(String [] args) {
		
		pappagallo eddy = new pappagallo();
		eddy.cambiaNome("Eddy");
		eddy.printNome();
		int euro=0;
		System.out.println("Inserisci il tuo budget:");
		Scanner scan = new Scanner(System.in);
		euro=scan.nextInt();
		eddy.possoComprarlo(euro);
		
	}
	
}
