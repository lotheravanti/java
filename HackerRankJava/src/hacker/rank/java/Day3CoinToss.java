package hacker.rank.java;

import java.util.Random;

public class Day3CoinToss {

	public String tossACoin() {
		Random rand = new Random();
		int toss = Math.abs(rand.nextInt()) % 2;
		if (toss == 0) {
			return "HEADS";
		} else {
			return "TAILS";
		}
	}
	
	public static void main(String[] args) {
			
	Day3CoinToss game = new Day3CoinToss();
	System.out.println(game.tossACoin());
	System.out.println(game.tossACoin());
	System.out.println(game.tossACoin());
	System.out.println(game.tossACoin());
	System.out.println(game.tossACoin());
	System.out.println(game.tossACoin());
	System.out.println(game.tossACoin());
		
	}
}
