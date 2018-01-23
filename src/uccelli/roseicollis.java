package uccelli;

public class roseicollis extends pappagallo {
	
	private String provenienza="Africa";
	private String mutazione="Ancestrale";
	
	public roseicollis(String nome, int anni) {
		super(nome, anni);
		super.setCosto(30);
	}
	
	public String provenienza() {
		return "Provenienza: "+(this.provenienza);
	}
	
	public String mutazione() {
		return this.mutazione;
	}
	
}
