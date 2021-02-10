package snakeandladderpkg;

public class SnakeAndLadder {
	public static void main(String[] args) {
		int playerPosition = 0, player1Position = 0, player2Position = 0;
		int dice = 0, checkOption, count1 = 0, count2 = 0;
		String player1 = "Player1";
		System.out.println("*****Welcome to the Snake and Ladder Game.*****");
		System.out.println(player1 + " at start position " + playerPosition);
		while ((player1Position >= 0 && player1Position < 10) || (player2Position >= 0 && player2Position < 10)) {
			dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
			checkOption = (int) Math.floor(Math.random() * 10) % 3 + 1;
			System.out.println("Player1's Turn : ");
			switch (checkOption) {
			case 1:
				System.out.println("Yeah! You got a Ladder. ");
				player1Position += dice;
				if (player1Position > 10) {
					player1Position -= dice;
				}
				System.out.println("Dice : " + dice);
				System.out.println("Your position is : " + player1Position);
				break;
			case 2:
				System.out.println("Oh No! Snake bit you. ");
				player1Position -= dice;
				if (player1Position < 0) {
					player1Position = 0;
				}
				System.out.println("Dice : " + dice);
				System.out.println("Your position is : " + player1Position);
				break;
			case 3:
				System.out.println("Pass the chance. ");
				System.out.println("Your position is : " + player1Position);
			}
			count1++;
			System.out.println("Die Roll count=" + count1 + " Position=" + player1Position);
			if (player1Position <= 0) {
				player1Position = 0;
				System.out.println("\nYour Position is :" + player1Position);
			}
			System.out.println("Player2's Turn : ");
			checkOption = (int) Math.floor(Math.random() * 10) % 3 + 1;
			switch (checkOption) {
			case 1:
				System.out.println("Yeah! You got a Ladder. ");
				player2Position += dice;
				if (player2Position > 10) {
					player2Position -= dice;
				}
				System.out.println("Dice : " + dice);
				System.out.println("Your position is : " + player2Position);
				break;
			case 2:
				System.out.println("Oh No! Snake bit you. ");
				player2Position -= dice;
				if (player2Position < 0) {
					player2Position = 0;
				}
				System.out.println("Dice : " + dice);
				System.out.println("Your position is : " + player2Position);
				break;
			case 3:
				System.out.println("Pass the chance. ");
				System.out.println("Your position is : " + player2Position);
			}
			count2++;
			System.out.println("Die Roll count=" + count2 + " Position=" + player2Position);
			if (player2Position <= 0) {
				player2Position = 0;
				System.out.println("\nYour Position is :" + player2Position);
			}
			if (player1Position == 10) {
				System.out.println("\nPlayer1=" + player1Position + "\t Player2=" + player2Position);
				System.out.println("\nCongratulations Player1 Won!");
				break;
			}
			if (player2Position == 10) {
				System.out.println("\nPlayer1=" + player1Position + "\t Player2=" + player2Position);
				System.out.println("\nCongratulations Player2 Won!");
				break;
			}
		}
	}
}
