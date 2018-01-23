package wordscounter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class reader {

	public String renamer(String nome) {
		String nomecompleto;
		nomecompleto=nome+".txt";
		return nomecompleto;
	}
	
	public static void newFile(String name) {
	    String path = "C:\\Users\\Lorenzo\\eclipse-workspace\\esercizi\\src\\wordscounter\\"+name;
	 
	    try {
	        File file = new File(path);
	         
	        if (file.exists())
	            System.out.println("Il file " + path + " esiste");
	        else if (file.createNewFile())
	            System.out.println("Il file " + path + " è stato creato");
	        else
	            System.out.println("Il file " + path + " non può essere creato");
	     
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void writeFile(String name, String text) {
	     
		String path = "C:\\Users\\Lorenzo\\eclipse-workspace\\esercizi\\src\\wordscounter\\"+name;
	     
	    try {
	    	File file = new File(path);
	    	FileWriter fw = new FileWriter(file);
	    	BufferedWriter bw = new BufferedWriter(fw);
	    	bw.write(text);
	    	bw.flush();
	    	bw.close();
	    }
	    catch(IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void readFile(String name) {
	    
		String path = "C:\\Users\\Lorenzo\\eclipse-workspace\\esercizi\\src\\wordscounter\\"+name;
		char[] in = new char[10000000];
		int size=0;
    	int words=1;
		
	    try {
	    	File file = new File(path);
	    	FileReader fr = new FileReader(file);
	    	BufferedReader br = new BufferedReader(fr);
	    	size=br.read(in);
	    	
	    	for(int c=0;c<size;c++) {
	    		if(c==0) {
	    			if(Character.isWhitespace(in[c]))
	    				c++;
	    		}
	    		
	    		if(Character.isWhitespace(in[c]) && Character.isWhitespace(in[c-1])) {
	    			c++;
	    		
	    		}
	    		else if(Character.isWhitespace(in[c])){
	    			words++;
	    		}
	    	}
	    	
	    	System.out.println("Numero di caratteri presenti: "+size);
	    
	    	//Eventuale parte per mostrare il contenuto del file di testo.
	    	/*	System.out.println("Contenuto del file: ");
	    	
	    	for(int i=0;i<size;i++) {
	    		System.out.print(in[i]);

	    	}*/
	    	
	    	br.close();	
	    	System.out.println("\nNumero di parole: "+words);
	    	
	    }
	    catch(IOException e){
	    	e.printStackTrace();
	    }
	}
	
}
