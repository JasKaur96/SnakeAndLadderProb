package snakeandladderpkg;

public class SnakeAndLadder {
	public static void main (String[] args) {
		int playerPosition = 0;
		int dice = 0, checkOption, count = 0;
		String player1 = "Player1";
		System.out.println("*****Welcome to the Snake and Ladder Game.*****");
		System.out.println(player1+" at start position "+playerPosition);
		
		while (playerPosition >= 0 && playerPosition < 10) {
			dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
			System.out.println("\ndice "+dice);
		
			checkOption = (int) Math.floor(Math.random() * 10) % 3 + 1;
			
			switch(checkOption) {
			case 1:
				System.out.println("Yeah! You got a Ladder. ");
				playerPosition += dice;
				if(playerPosition > 10) {
					playerPosition -= dice;					
				}
				System.out.println("Your position is : " +playerPosition);
				break;
				
			case 2:
				System.out.println("Oh No! Snake bit you. ");
				playerPosition -= dice;
				if(playerPosition < 0) {
					playerPosition = 0;
				}
				System.out.println("Your position is : " +playerPosition);
				break;
	
			case 3:
				System.out.println("Pass the chance. ");
				System.out.println("Your position is : " +playerPosition);
			}
			count++;
			System.out.println("Die Roll count="+count+" Position="+playerPosition);
			
		}
		
		if(playerPosition <= 0) {
			playerPosition = 0;
			System.out.println("\nYour Position is :"+playerPosition);
		}
		
		if(playerPosition == 10){
			System.out.println("\nCongratulations!!! You Won!");
		}
		
	}
}
