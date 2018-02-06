package char_exam;

public abstract class AbstractCharSequence implements CharSequence {

	public abstract int length();
	public abstract java.lang.CharSequence subSequence(int start, int end);
	public abstract char charAt(int pos);
	
	
	public final java.lang.String toString(){
		
		String result="";
		int lung=length();
		for(int c=0;c<lung;c++) {
			
			result+=charAt(c);
		
		}

		return result;
		
	}
	
}