package snakeandladderpkg;

public class SnakeAndLadder {
	public static void main (String[] args) {
		int player1Position = 0, player2Position = 0, playerPosition = 0;
		int count1 = 0, count2 = 0;
		String player1 = "Player1", player2 = "Player2";
		System.out.println("*****Welcome to the Snake and Ladder Game.*****");
		System.out.println(player1+" Position="+player1Position+" and "+player2+" Position="+player2Position);
		
		while (player1Position < 10 && player2Position < 10) {
			
			System.out.println("\nPlayer1's Turn:");
			diceRoll(player1Position,player1);
			count1++;
			System.out.println("Die Roll count="+count1+" Position="+player1Position);
						
			System.out.println("\nPlayer2's Turn:");
			diceRoll(player2Position,player2);
			player2Position = playerPosition;
			count2++;
			System.out.println("Die Roll count="+count2+" Position="+player2Position);
			
		}
		if(player1Position > player2Position) 
			System.out.println("\nPlayer1 Won the game!");
		else
			System.out.println("\nPlayer2 Won the game!");
			
	}
	
	public static void diceRoll(int playerPosition, String player) {
		int dice = 0, checkOption;
		
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
			System.out.println("Your position is : " + playerPosition);
			break;
			
		case 2:
			System.out.println("Oh No! Snake bit you. ");
			playerPosition -= dice;
			if(playerPosition < 0) {
				playerPosition = 0;
			}
			System.out.println("Your position is : " + playerPosition);
			break;

		case 3:
			System.out.println("Pass the chance. ");
			System.out.println("Your position is : " + playerPosition);
		}
		
		if(player.equals(Player1)) {
			player1Position += playerPosition;
			System.out.println(player + " position : " + player1Position);
			
		}
		
	}	
}
