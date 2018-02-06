package orario;

public class Time implements Model { 
	... 
	private final Set<View> views = new HashSet<>(); // tutte le view a cui e’ connesso
	
	@Override 
	public void set(int hours, int minutes, int seconds) throws IllegalArgumentException {
		... for (View view: views) // notifica tutte le view del nuovo orario 
			view.onTimeChanged(hours, minutes, seconds); 
	} 
	... 
	
	@Override 
	public void linkToView(View view) { 
		views.add(view); 
		view.onTimeChanged(hours, minutes, seconds); 
	}
}
