package orario;

public class Main {

	public static void main(String[] args) {
		Model model = new Time();
		Controller controller = new ControllerImpl(model);
		model.linkToView(new TextDateView());
		model.linkToView(new SwingDateView(controller));
		//model.linkToView(new Swing12DateView(controller));
	}
}