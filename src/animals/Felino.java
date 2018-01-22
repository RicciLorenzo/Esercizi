package animals;


public class Felino {
	public boolean Domestico() {
		return true;
	}

	public int costo() {
		return 0;
	}

	public String toString() {
		return "";
	}

	public final boolean possoComprarloCon(int euro) {
		return Domestico() && costo() <= euro;
	}
}
