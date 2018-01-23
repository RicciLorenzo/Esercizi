package uccelli;

public class pappagallo {

	private String nome;
	private int anni;
	private int costo;
	
	public pappagallo(String nome, int anni) {
		this.nome=nome;
		this.anni=anni;
		costo=20;
	}
	
	public void setCosto(int i) {
		this.costo+=i;
	}
	
	public int costo() {
		return this.costo;
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
		if(euro>=costo)
			System.out.println("Si");
		else
			System.out.println("No");
	}
	
	
}
