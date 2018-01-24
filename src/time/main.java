package time;

public class main {

	public static void main(String[] args) {
		
		Time tempo = new Time(2018,1,24,00,28);
		System.out.println(tempo.toStringOnlyHour());
		
		System.out.println(tempo.compareTo(new Time(2018,1,24,00,28)));
		System.out.println("-----------------");
		Train treno = new Train(tempo,60,"Cremona");
		System.out.println(treno.toString());
		System.out.println(treno.compareTo(new Train((new Time(2018,1,24,00,28)),55,"Monteriggioni")));
		
	}
	
}
