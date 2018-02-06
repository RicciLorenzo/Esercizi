package orario;

import java.util.Calendar;

public class ControllerImpl implements Controller { 
	
	private final Model model; // dove effettuare le modifiche
	
	public ControllerImpl(Model model) { 
		this.model = model; 
		onResetTime(); // alla creazione del controller, il modello viene settato al tempo corrente 
	} 
	
	@Override
	public void onIncreaseHours() {
		if(model.getHours()==23)
			model.set(0, model.getMinutes(), model.getSeconds());
		else
			model.set(model.getHours()+1, model.getMinutes(), model.getSeconds());
		
	}
	
	@Override
	public void onDecreaseHours() {
		
		if(model.getHours()==0)
			model.set(model.getHours()+23, model.getMinutes(), model.getSeconds());
		else
			model.set(model.getHours()-1, model.getMinutes(), model.getSeconds());
		
	}

	@Override
	public void onIncreaseMinutes() {
		
		if(model.getMinutes()==59) {
			if(model.getHours()==23)
				model.set(model.getHours()+1, 00, model.getSeconds());
		}
		else
			model.set(model.getHours(), model.getMinutes(), model.getSeconds());
			
		
	}

	@Override
	public void onDecreaseMinutes() {
		
		if(model.getMinutes()==0) {
			if(model.getHours()==0)
				model.set(23, 59, model.getSeconds());
		}
		else
			model.set(model.getHours(), model.getMinutes(), model.getSeconds());
		
	}

	@Override
	public void onIncreaseSeconds() {
		
		if(model.getSeconds()==59) {
			if(model.getMinutes()==59) {
				if(model.getHours()==23)
					model.set(0, 0, 0);
				model.set(model.getHours()+1, 0, 0);
			}
			model.set(model.getHours(), model.getMinutes()+1, 0);
		}
		else
			model.set(model.getHours(), model.getMinutes(), model.getSeconds()+1);
		
	}

	@Override
	public void onDecreaseSeconds() {
		
		if(model.getSeconds()==0) {
			if(model.getMinutes()==0) {
				if(model.getHours()==0)
					model.set(23, 59, 59);
				model.set(model.getHours()-1, 59, 59);
			}
			model.set(model.getHours(), model.getMinutes()-1, 59);
		}
		else
			model.set(model.getHours(), model.getMinutes(), model.getSeconds()-1);
		
	}
	
	@Override public void onResetTime() { 
		Calendar calendar = Calendar.getInstance(); 
		model.set(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND)); 
	
	}

}