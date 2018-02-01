package negozio2;

public class Main { 
	public static void main(String[] args) throws MissingProductException { 
		Product bike = new Product("bike", 300.0, 7); // una bicicletta costa 300 euro ed e’ disponibile per la spedizione in 7 giorni 
		Product phone = new Product("phone", 129.9, 1); // un telefono costa 129.9 euro ed e’ disponibile per la spedizione in un giorno 
		Shop amazing = new Shop(); 
		amazing.add(bike, 3); 
		amazing.add(phone, 4); // il negozio amazing ha disponibili 3 bici e 4 telefoni 
		
		// creiamo tre ordini, due semplici e uno dividendo i prodotti per attesa di spedizione
		
		Order order1 = new SimpleOrder(amazing, bike, phone, phone); // una bici e due telefoni 
		Order order2 = new SplitOrder(amazing, phone, bike, phone); // una bici e due telefoni 
		Order order3 = new SimpleOrder(amazing, bike, phone); // una bici e un telefono 
		
		// effettuiamo i tre ordini e stampiamo le spedizioni che ne risultano 
		
		printShipping("FIRST ORDER:", order1.ship()); 
		printShipping("SECOND ORDER:", order2.ship()); 
		printShipping("THIRD ORDER:", order3.ship()); 
	}

	private static void printShipping(String title, Iterable<Shipping> shippings) { 
		System.out.println(title + "\n"); 
		int counter = 1; 
		for (Shipping shipping: shippings) 
			System.out.println("shipping #" + counter++ + "\n" + shipping); 
		System.out.println(); 
	}
}