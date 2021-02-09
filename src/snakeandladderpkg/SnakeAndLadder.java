package snakeandladderpkg;

public class SnakeAndLadder {
	public static void main (String[] args) {
		int playerPosition = 0, dice;
		String player1 = "Player1";
		System.out.println("*****Welcome to the Snake and Ladder Game.*****");
		System.out.println(player1+" at start position "+playerPosition);

		dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
		playerPosition += dice; 
		System.out.println("Dice shows : "+dice);
		System.out.println(player1+" is at position "+playerPosition);

	}
}
