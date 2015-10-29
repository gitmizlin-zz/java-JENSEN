// 2015-10-08. In class by Oscar

import java.util.ArrayList;
import java.util.Random;

public class CardGame {
 	public static void main(String[] args) {

		System.out.println("Welcome to Card Game!");

		ArrayList<PlayingCard> deck;

		deck = DeckOfCards.getDeckOfCards();		

		for (PlayingCard card : deck) {
			System.out.println(card);
		}
 
		Player p1 = new Player();
		Player p2 = new Player();

		int index1 = getRandomInt(1, 52);
		int index2 = getRandomInt(1, 52);

		p1.randCard = deck.get(index1);
		p2.randCard = deck.get(index2);

		System.out.println("p1's card: " + p1.randCard);
		System.out.println("p2's card: " + p2.randCard);
		
		int v1 = p1.randCard.getValue();
		int v2 = p2.randCard.getValue();

		int result = compare(v1, v2);

		switch (result) {
			case -1: System.out.println("p2 won"); p2.point++; break;
			case  0: System.out.println("Draw"); break;
			case  1: System.out.println("p1 won"); p1.point++; break;
		}

		System.out.println("p1's point: " + p1.point);
		System.out.println("p2's point: " + p2.point);

	}

	public static int getRandomInt(int min, int max) {
		Random rand = new Random();
		int generateInt = rand.nextInt((max - min) + 1) + min; 
		return generateInt;
	}

	public static int compare(int i1, int i2) {
		return Integer.compare(i1, i2);
	}
}
