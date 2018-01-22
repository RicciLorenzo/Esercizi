package poker;

import java.util.concurrent.ThreadLocalRandom;

public class card {

	private int randomNum,suit;
	String seme=null;
	
	public card(int min) {
		
		randomNum = ThreadLocalRandom.current().nextInt(min, 14);
		suit = ThreadLocalRandom.current().nextInt(1, 5);	
		
		
		if(suit==1)
			seme="♠";
		if(suit==2)
			seme="♥";
		if(suit==3)
			seme="♦";
		if(suit==4)
			seme="♣";
			
		
	}
	
	public int getValue() {
		
		return randomNum;
		
	}
	
	public int getSuit() {
		
		return suit;
		
	}
	
	@Override
	public String toString() {
		
		String tipo=null;
		
		if(randomNum==11)
			tipo="J";		
		if(randomNum==12)
			tipo="Q";
		if(randomNum==13)
			tipo="K";
		if(randomNum==1)
			tipo="A";
		
		if((randomNum>10 && randomNum<14) || randomNum==1)
			return tipo + this.seme;
		else
			return this.randomNum + this.seme;
		
	}
	
	public boolean equals(card other) {
		/*
		if(this.randomNum == other.randomNum && this.suit == other.suit)
			return true;
		else 
			return false;
		*/
		return randomNum == other.randomNum && this.suit == other.suit;
		
	}
	
	public int modifyValue(int mod) {
		randomNum=mod;
		return randomNum;
	}
	

}
