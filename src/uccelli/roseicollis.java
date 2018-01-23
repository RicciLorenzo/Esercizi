package uccelli;

public class roseicollis extends pappagallo {
	
	private String provenienza="Africa";
	
	public roseicollis(String nome, int anni) {
		super(nome, anni);
		super.setCosto(30);
	}
	
	public String provenienza() {
		return "Provenienza: "+(this.provenienza);
	}
	
}
