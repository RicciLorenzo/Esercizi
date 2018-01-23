package uccelli;

import java.util.Scanner;

public class main {

	public static void main(String [] args) {
		
		pappagallo eddy = new pappagallo("cane",2);
		eddy.cambiaNome("Eddy");
		System.out.println(eddy.printNome());
		int euro=0;
		System.out.println("Inserisci il tuo budget:");
		Scanner scan = new Scanner(System.in);
		euro=scan.nextInt();
		eddy.possoComprarlo(euro);
		
		System.out.println("-------------");
		
		roseicollis prova = new roseicollis("tom",3);
		System.out.println(prova.printNome());
		euro=0;
		System.out.println("Inserisci il tuo budget:");
		euro=scan.nextInt();
		prova.possoComprarlo(euro);
		System.out.println(prova.provenienza());
		
		
	}
	
}
