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
		
		roseicollis rosei = new roseicollis("tom",3);
		System.out.println(rosei.printNome());
		euro=0;
		System.out.println("Inserisci il tuo budget:");
		euro=scan.nextInt();
		rosei.possoComprarlo(euro);
		System.out.println(rosei.provenienza());
		
		System.out.println("-------------");
		
		opalino opal = new opalino("jim",1);
		System.out.println(opal.printNome());
		System.out.println(opal.mutazione());
		euro=0;
		System.out.println("Inserisci il tuo budget:");
		euro=scan.nextInt();
		opal.possoComprarlo(euro);
		System.out.println(opal.provenienza());
		
		
	}
	
}
