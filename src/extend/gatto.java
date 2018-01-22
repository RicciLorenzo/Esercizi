package extend;

public class gatto {

	String nome;
	int anni;
	String razza;
	
	
	public void printNome() {
		System.out.println("Nome del gattolol: "+this.nome);
	}
	
	public void printRazza() {
		System.out.println("Razza del gatto: "+this.razza);
	}
	
	public void printAnni() {
		System.out.println("Anni del gatto: "+this.anni);
	}
	
	public class matimati extends gatto{
		String nome;
	}
	
	
}
