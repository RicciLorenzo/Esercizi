package aerei;

public class Aircraft {

	private String name="";
	private int capacity;
	
	public Aircraft(String name, int capacity) {
		this.name=name;
		this.capacity=capacity;
	}
	
	public int getCapacity() {
		return this.capacity; 
	} 
	
	@Override 
	public String toString() {
		return this.name; 
	}
	
	
}
