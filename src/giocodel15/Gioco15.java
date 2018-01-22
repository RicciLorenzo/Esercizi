package giocodel15;

import java.util.concurrent.ThreadLocalRandom;

public class Gioco15 {

	private Integer[][] gioco = new Integer[4][4];
	
	public Gioco15() {
		
		int x=0;
		int y=0;
		int i=1;
		
		for(int c=0;c<4;c++) {
			for(int r=0;r<4;r++) {
				gioco[c][r]=0;
			}
		}
		
		for(int c=0;c<15;c++, i++) {
			
			while(gioco[x][y]!=0) {
				x = ThreadLocalRandom.current().nextInt(0, 4);
				y = ThreadLocalRandom.current().nextInt(0, 4);
			}
			
			gioco[x][y]=i;
			
		}
		
	}
	
	@Override
	public String toString() {
		
		String result="";
				
		for(int c=0;c<4;c++) {
			for(int r=0;r<4;r++) {
				if(gioco[r][c]==0)
					result += "    ";
				else if((gioco[r][c]/10)<1) {
					int i = gioco[r][c].intValue();
					result += i+"   ";
				}
				else {
					int i = gioco[r][c].intValue();
					result += i+"  ";
				}
			}
			
			result += "\n";
		}

		return result;
		
	}
	
	public void sposta(int x, int y) {

		System.out.println("Controllo se si può fare...\n\n");
		
		int r,c;
		c=x;
		r=y;
		boolean mossa=false;
			
		while(!mossa) {
				
				if(gioco[x][y]==0) {			
					System.out.println("Stai selezionando la casella vuota!\n");
					mossa=true;
					break;
				}
				
				if(r-1>=0) {
					r=r-1;		
					System.out.println("Controllo la casella "+c+" "+r);
					
					if(gioco[c][r]==0) {
						System.out.println("Fatto!");
						System.out.println(gioco[c][r]+" Trovato!");
						gioco[c][r]=gioco[x][y];
						gioco[x][y]=0;
						mossa=true;
						break;
					
					}
					
					else {
						mossa=true;
						System.out.println("Niente...");
					}
					r=r+1;
				}
				
				if(r+1<=3) {
					r=r+1;
					System.out.println("Controllo la casella "+c+" "+r);
					
					if(gioco[c][r]==0) {
						System.out.println(gioco[c][r]+" Trovato!");
						System.out.println("Fatto!");
						gioco[c][r]=gioco[x][y];
						gioco[x][y]=0;
						mossa=true;
						break;
					
					}
					
					else {
						mossa=true;
						System.out.println("Niente...");
					}
					r=r-1;
				}

				if(c-1>=0) {
					c=c-1;
					System.out.println("Controllo la casella "+c+" "+r);
					
					if(gioco[c][r]==0) {
						System.out.println(gioco[c][r]+" Trovato!");
						System.out.println("Fatto!");
						gioco[c][r]=gioco[x][y];
						gioco[x][y]=0;
						mossa=true;
						break;
					
					}
					
					else {
						mossa=true;
						System.out.println("Niente...");
					}
					c=c+1;
				}

				if(c+1<=3){
					c=c+1;
					System.out.println("Controllo la casella "+c+" "+r);
					
					if(gioco[c][r]==0) {
						System.out.println(gioco[c][r]+" Trovato!");
						System.out.println("Fatto!");
						gioco[c][r]=gioco[x][y];
						gioco[x][y]=0;
						mossa=true;
						break;
					
					}
					
					else {
						mossa=true;
						System.out.println("Niente...");
					}
					c=c-1;
				}
			
		}
		
		
	}
	
}
