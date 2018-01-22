package poker;

import java.util.concurrent.ThreadLocalRandom;

public class hand {

	card carta1;
	card carta2;
	card carta3;
	card carta4;
	card carta5;
		
	public hand(int min) {
		
		carta1 = new card(min);
		
	
		do{
			carta2 = new card(min);
		}while(carta1.equals(carta2));

	
		
		do{
			carta3 = new card(min);
		}while((carta2.equals(carta3)) || (carta1.equals(carta3)));

		
		do{
			carta4 = new card(min);
		}while((carta3.equals(carta4)) || (carta2.equals(carta4) || (carta1.equals(carta4))));
		
		
		do{
			carta5 = new card(min);
		}while((carta4.equals(carta5)) || (carta3.equals(carta5) || (carta2.equals(carta5) || (carta1.equals(carta5)))));

		
		order();
		
	}
	
	public String toString() {
		
		return carta1.toString() + " " + carta2.toString() + " " + carta3.toString() + " " + carta4.toString() + " " + carta5.toString();
		
	}
	
	public String category() {


		if(pairs()=='p') 
			return "Poker";
		else if(ladders()=='r')
			return "Royal Straight";
		else if(ladders()=='k')
			return "Color Straight";
		else if(ladders()=='s')
			return "Straight";
		else if(flush())
			return "Flush";
		else if(pairs()=='f')
			return "Full House";
		else if(pairs()=='d') 
			return "Double pair";
		else if(pairs()=='t') 
			return "Tris";
		else if(pairs()=='c') 
			return "Pair";
		else
			return "Carta alta: "+higher();

	}
	
	private char pairs() {
		
		char result='n';

		if(carta1.getValue()==carta2.getValue())
			result='c';
		
		if(carta2.getValue()==carta3.getValue()) {
			if(result=='c')
				result='t';
			else
				result='c';
		}
		
		if(carta3.getValue()==carta4.getValue()) {
			if(carta2.getValue()==carta3.getValue() || carta1.getValue()==carta3.getValue())
				result='t';
			else if(carta1.getValue()!=carta3.getValue() && carta1.getValue()==carta2.getValue())
				result='d';
			else
				result='c';
		}
		
		if(carta4.getValue()==carta5.getValue()) {
			if(carta4.getValue()==carta3.getValue() || carta4.getValue()==carta2.getValue() || carta4.getValue()==carta1.getValue())
				result='t';
			else if(carta1.getValue()!=carta4.getValue() && carta1.getValue()==carta2.getValue())
				result='d';
			else if(carta3.getValue()!=carta4.getValue() && carta3.getValue()==carta2.getValue())
				result='d';
			else if(carta1.getValue()!=carta4.getValue() && carta1.getValue()==carta3.getValue())
				result='d';
			else
				result='c';
			
			
		}	

			
		if(carta1.getValue()==carta2.getValue() && carta2.getValue()==carta3.getValue() && carta3.getValue()==carta4.getValue())
			result='p';
		if(carta2.getValue()==carta3.getValue() && carta3.getValue()==carta4.getValue() && carta4.getValue()==carta5.getValue())
			result='p';
		if(carta1.getValue()==carta2.getValue() && carta2.getValue()==carta4.getValue() && carta4.getValue()==carta5.getValue())
			result='p';
		
		
		if(carta1.getValue()==carta2.getValue() && carta2.getValue()==carta3.getValue() && carta4.getValue()==carta5.getValue())
			result='f';
		if(carta1.getValue()==carta2.getValue() && carta3.getValue()==carta4.getValue() && carta4.getValue()==carta5.getValue())
			result='f';

			
		return result;	
		
		
	} 
	
	private char ladders() {
		
		char result='n';
		
		
		if(/*carta1.getValue()==carta2.getValue()+1 && */carta2.getValue()==carta3.getValue()+1 && carta3.getValue()==carta4.getValue()+1 && carta4.getValue()==carta5.getValue()+1) {
			if(carta1.getSuit()==carta2.getSuit() && carta2.getSuit()==carta3.getSuit() && carta3.getSuit()==carta4.getSuit() && carta4.getSuit()==carta5.getSuit()) {
				if(carta1.getValue()==13)
					result='r';
				else
					result='k';
			}
			else
				result='s';
		}
			
		if(/*carta1.getValue()+1==carta2.getValue() &&*/ carta2.getValue()+1==carta3.getValue() && carta3.getValue()+1==carta4.getValue() && carta4.getValue()+1==carta5.getValue()) {	
			if(carta1.getSuit()==carta2.getSuit() && carta2.getSuit()==carta3.getSuit() && carta3.getSuit()==carta4.getSuit() && carta4.getSuit()==carta5.getSuit()) {
				if(carta1.getValue()==1 && carta5.getValue()==13) 
					result='r';
				else
					result='k';
				}
			else
				result='s';
		}
		
		return result;
		
	}
	
	private int higher() {
		
		int temp=0;
		temp=carta1.getValue();
		
		if(carta2.getValue()>carta1.getValue())
			temp=carta2.getValue();
		if(carta3.getValue()>carta2.getValue())
			temp=carta3.getValue();
		if(carta4.getValue()>carta3.getValue())
			temp=carta4.getValue();
		if(carta5.getValue()>carta4.getValue())
			temp=carta5.getValue();
				
		return temp;
		
	}
	
	private boolean flush() {
		
		if(carta1.getSuit()==carta2.getSuit() && carta2.getSuit()==carta3.getSuit() && carta3.getSuit()==carta4.getSuit() && carta4.getSuit()==carta5.getSuit())
			return true;
		
		return false;
		
	}
	
	private void order() {
		
		for(int count=0;count<5;count++) {
			
			int temp=0;
			
			if(carta1.getValue()>carta2.getValue()) {
				temp=carta1.getValue();
				carta1.modifyValue(carta2.getValue());
				carta2.modifyValue(temp);
				count=0;
			}
			else
				count++;
			
			if(carta2.getValue()>carta3.getValue()) {
				temp=carta2.getValue();
				carta2.modifyValue(carta3.getValue());
				carta3.modifyValue(temp);
				count=0;
			}
			else
				count++;
			
			if(carta3.getValue()>carta4.getValue()) {
				temp=carta3.getValue();
				carta3.modifyValue(carta4.getValue());
				carta4.modifyValue(temp);
				count=0;
			}
			else
				count++;
			
			if(carta4.getValue()>carta5.getValue()) {
				temp=carta4.getValue();
				carta4.modifyValue(carta5.getValue());
				carta5.modifyValue(temp);
				count=0;
			}
			else
				count++;
			
		}
		
		
	}
	
}
