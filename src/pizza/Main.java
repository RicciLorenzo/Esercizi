package pizza;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Pizza p1 = Menu.FUNGHI;
		Pizza p2 = Menu.MARGHERITA;
		Pizza p3 = Menu.PROSCIUTTO_FUNGHI;
		Pizza p4 = new PizzaWithout(p1, "mushrooms", 2); // p4 e’ p1 con la rimozione dei funghi 
		Pizza p5 = new PizzaWith(p4, "mushrooms", 2); // p5 e’ p4 con l’aggiunta dei funghi
		
		
		Set<Pizza> allFiveSet = new HashSet<>();
		allFiveSet.add(p1);
		allFiveSet.add(p2);
		allFiveSet.add(p3); 
		allFiveSet.add(p4);
		allFiveSet.add(p5);
		
		List<Pizza> allFiveList = new LinkedList<>();
		allFiveList.add(p1);
		allFiveList.add(p2);
		allFiveList.add(p3);
		allFiveList.add(p4);
		allFiveList.add(p5);
		
		Pizza[] allFiveArray = new Pizza[] { p1, p2, p3, p4, p5};
		System.out.println("allFiveSet.size() = " + allFiveSet.size()); 
		System.out.println("allFiveList.size() = " + allFiveList.size()); 
		System.out.println("allFiveArray.length = " + allFiveArray.length);
		Order order = new Order(allFiveArray); System.out.println(order);
		
	}
}