package uccelli;

public class pappagallo {

	String nome;
	int anni;
	
	public int costo() {
		return 20;
	}
	
	public void cambiaNome(String nome) {
		this.nome=nome;
	}
	
	public void cambiaAnni(int anni) {
		this.anni=anni;
	}
	
	public void printNome() {
		System.out.println("Nome: "+this.nome);
	}
	
	public void printAnni() {
		System.out.println("Anni: "+this.anni);
	}
	
	public void possoComprarlo(int euro) {
		System.out.println("Posso comprarlo con "+euro+" euro?");
		if(euro>=costo())
			System.out.println("Si");
		else
			System.out.println("No");
	}
	
	
}
