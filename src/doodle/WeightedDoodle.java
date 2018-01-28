package doodle;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class WeightedDoodle extends Doodle {
	private final Map<String, Double> weights = new HashMap<>(); // una mappa da nome a peso
	
	@Override 
	public void available(String name, Slot... when) {
		super.available(name,when);
		weights.put(name, 1.0);
		
	} // peso per default 1.0 
	
	@Override 
	public void available(String name, Iterable<Slot> when) {
		
		super.available(name,when);
		weights.put(name, 1.0);
		
	} // peso per default 1.0 
	
	public void available(String name, double weight, Slot... when) {
		
		super.available(name,when);
		weights.put(name, weight);
		
	} // peso indicato 
	
	public void available(String name, double weight, Iterable<Slot> when) {
		super.available(name,when);
		weights.put(name, weight);
	} // peso indicato 
	
	@Override 
	protected double weightOf(String name) {
		
		return weights.get(name);
		
	}
}