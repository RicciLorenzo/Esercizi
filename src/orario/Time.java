package orario;

import java.util.HashSet;
import java.util.Set;

public class Time implements Model { 
	int hours;
	int minutes;
	int seconds;
	private final Set<View> views = new HashSet<>(); // tutte le view a cui e’ connesso
	
	@Override 
	public void set(int hours, int minutes, int seconds) throws IllegalArgumentException {
		if(hours<0||hours>23)
			throw new IllegalArgumentException();
		if(minutes<0||minutes>59)
			throw new IllegalArgumentException();
		if(seconds<0||seconds>59)
			throw new IllegalArgumentException();
		
		for (View view: views) // notifica tutte le view del nuovo orario 
			view.onTimeChanged(hours, minutes, seconds); 
		
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
		
	}
	
	@Override 
	public void linkToView(View view) { 
		views.add(view); 
		view.onTimeChanged(hours, minutes, seconds); 
	}
	
	@Override
	public int getHours() {
		return hours;
	}
	
	@Override
	public int getMinutes() {
		return minutes;
	}
	
	@Override
	public int getSeconds() {
		return seconds;
	}
	
}