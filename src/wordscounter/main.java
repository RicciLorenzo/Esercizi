package wordscounter;
import java.util.Scanner;
import java.util.concurrent.*;
import java.io.File;


public class main {

	public static void main(String[] args){
		
		System.out.println("Inizio del programma...");
		//TimeUnit.SECONDS.sleep(1);
		System.out.println("..");
		//TimeUnit.SECONDS.sleep(1);
		System.out.println(".\n");
		//TimeUnit.SECONDS.sleep(1);
		System.out.print("Inserire il nome del file di testo da creare: ");
		String nome;
		Scanner scan = new Scanner(System.in);
		nome = scan.nextLine();
				
		reader app = new reader();
		String completo="";
		completo=app.renamer(nome);
		
		
		app.newFile(completo);
		
		//System.out.println("Digita il nome del file su cui vuoi scrivere: ");
		//nome=scan.nextLine();
		//app.writeFile(app.renamer(nome));
		
		System.out.println("Lettura del contenuto del file...");
		app.readFile(completo);		

		
		String testo;
		Scanner sct = new Scanner(System.in);
		System.out.println("\nInserisci il testo da mettere nel file");
		testo = sct.nextLine();
		app.writeFile(completo, testo);
		
		sct.close();
		scan.close();
		
		System.out.println("Lettura del contenuto del file...");
		app.readFile(completo);		
		
		System.out.println("FINITO!");
		
		
	}
	
}
