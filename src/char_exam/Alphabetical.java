package char_exam;

public class Alphabetical extends AbstractCharSequence { 
	char start;
	int length;
	String result="";
	
	public Alphabetical(char start, int length) {
		
		if(start<'a' && start>'z') {
			throw new IllegalArgumentException();
		}
		
		if(length<0)
			throw new IndexOutOfBoundsException();
		
		this.start=start;
		this.length=length;
		result+=start;
		
		for(int c=0;c<length;c++) {
			if(result.charAt(c)=='z')
				result+='a';
			else
				result+=(result.charAt(c)+1);
		}
		
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