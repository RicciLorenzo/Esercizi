package extend;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Creazione di un gatto...");
		Scanner scan = new Scanner(System.in);
		
		gatto a = new gatto();
		System.out.println("Inserire il nome del gatto:");
		a.nome=scan.nextLine();
		System.out.println("Inserire la razza del gatto:"); 
		a.razza=scan.nextLine();
		System.out.println("Inserire gli anni del gatto:"); 
		a.anni=scan.nextInt();
		System.out.println("\nRIEPILOGO DEL GATTO:");
		a.printNome();
		a.printAnni();
		a.printRazza();
		
	}
	
}
