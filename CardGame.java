public class CardGame {
  
  public static void main(String[] args) {

    PlayingCard card = new PlayingCard("Diamonds", 5);
    System.out.println("Created card: " + card.getSuit() + " " + card.getRank());

    PlayingCard card2 = new PlayingCard("Hearts", 1);
    System.out.println("Created info: " + card2.getCardInformation());

    PlayingCard card3 = new PlayingCard("Spades", 7);
    System.out.println(card3);

  }
}

class PlayingCard {

  // Klassvariabler


  // Instansvariabler
  private String suit; // diamonds, hearts, spades, clubs
  private int rank; // 1-13

  // Konstruktorer
  public PlayingCard(String suit, int rank) {
    this.suit = suit; // samma som "card.suit = suit".  this = "this object's"
    this.rank = rank;
  }


  // Statiska metoder (klassmetoder)


  // Objektets metoder (objektmetoder)

  public String getSuit() {
    return suit;
  }

  public int getRank() {
    return rank;
  }

  public String getCardInformation() {
    String information = "Card info: " + suit + " " + rank;
    return information;
  }

  // toString = speciell metod för att representera ens objekt som en sträng
  // exempel: Namnet på objektet, ID:t på objektet, nånting beskrivande för just det objektet
  public String toString() {
    return suit + " " + rank;
  }


}