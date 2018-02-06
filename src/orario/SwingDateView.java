package orario;

public class SwingDateView extends JFrame implements View { 
	private final JLabel hours = new JLabel(), minutes = new JLabel(), seconds = new JLabel();

	public SwingDateView(Controller controller) { 
		super("Time");
		setMinimumSize(new Dimension(200, 120)); 
		add(buildClockPanel(controller), BorderLayout.CENTER); // aggiunge le componenti grafiche necessarie pack(); setVisible(true); 
	}
	
	protected JPanel buildClockPanel(Controller controller) { 
		JPanel clock = new JPanel();
		// crea la colonna delle ore 
		JPanel hoursPanel = new JPanel(); 
		hoursPanel.setLayout(new BorderLayout()); 
		JButton increaseHours = new JButton("+"); 
		hoursPanel.add(increaseHours, BorderLayout.NORTH); 
		hoursPanel.add(hours, BorderLayout.CENTER); 
		JButton decreaseHours = new JButton("-"); 
		hoursPanel.add(decreaseHours, BorderLayout.SOUTH); 
		clock.add(hoursPanel); 
		//... codice simile per la colonna dei minuti e dei secondi: NON SCRIVETELO, TANTO E’ IDENTICO
		
		// settaggio dei listeners di attivazione dei bottoni 
		increaseHours.addActionListener(e -> controller.onIncreaseHours()); 
		decreaseHours.addActionListener(e -> controller.onDecreaseHours()); 
		increaseMinutes.addActionListener(e -> controller.onIncreaseMinutes()); 
		decreaseMinutes.addActionListener(e -> controller.onDecreaseMinutes()); 
		increaseSeconds.addActionListener(e -> controller.onIncreaseSeconds()); 
		decreaseSeconds.addActionListener(e -> controller.onDecreaseSeconds());
		return clock;
	}
	
	@Override 
	public void onTimeChanged(int hours, int minutes, int seconds) { 
		this.hours.setText(String.valueOf(hours)); 
		this.minutes.setText(String.format("%02d", minutes)); 
		this.seconds.setText(String.format("%02d", seconds)); 
	}

}