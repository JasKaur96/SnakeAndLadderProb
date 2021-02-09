package snakeandladderpkg;

public class SnakeAndLadder {
	public static void main (String[] args) {
		int playerPosition = 0;
		int dice, checkOption;
		String player1 = "Player1";
		System.out.println("*****Welcome to the Snake and Ladder Game.*****");
		System.out.println(player1+" at start position "+playerPosition);
		
		dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
						
		checkOption = (int) Math.floor(Math.random() * 10) % 3 + 1;
		switch(checkOption) {
		case 1:
			System.out.println("\nPass the chance. ");
			break;
		case 2:
			System.out.println("\nYeah! You got a Ladder. ");
			playerPosition += dice;
			System.out.println("Your position is : " +playerPosition);
			break;
		case 3:
			System.out.println("\nOh No! Snake bit you. ");
			playerPosition -= dice;
			System.out.println("Your position is : " +playerPosition);
			
		}
	}
}
