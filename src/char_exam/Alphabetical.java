package char_exam;

public class Alphabetical extends AbstractCharSequence { 
	char start;
	int length;
	
	public Alphabetical(char start, int length) {
		
		if(start<'a' && start>'z') {
			throw new IllegalArgumentException();
		}
		
		if(length<0)
			throw new IndexOutOfBoundsException();
		
		this.start=start;
		this.length=length;

		
	}
	
	@Override 
	public int length() {
		
		return length;

	}
	
	@Override 
	public char charAt(int index) {

		return charAt(index);
	}
	
	@Override 
	public Alphabetical subSequence(int start, int end) {

		return new Alphabetical('s',end-start);
	}

}