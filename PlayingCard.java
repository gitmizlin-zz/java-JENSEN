
class PlayingCard {

  // Klassvariabler


  // Instansvariabler
  private String suit_;    // Diamonds / Hearts / Clubs / Spades
  private int value_;      // 1 - Ace, 2 - 10, 11 - Jack, 12 - Queen, 13 - King


  // Konstruktorer
  public PlayingCard(String suit, int value) {
    suit_ = suit;
    value_ = value;
}

  // Konstruktor som körs när man kör PlayingCard card = new PlayingCard('Q', "Hearts");
  public PlayingCard(char value, String suit) {
    // Gör någonting...
  }

  // Konstruktor som körs när man kör PlayingCard card = new PlayingCard("Hearts", 'Q');
  public PlayingCard(String suit, char value) {
    suit_ = suit;

    if(value == 'A') {
      value_ = 1;
    } else if (value == 'J') {
      value_ = 11;
    } else if (value == 'Q') {
      value_ = 12;
    } else if (value == 'K') {
      value_ = 13;
    }

  }

  // Statiska metoder (klassmetoder)


  // Objektets metoder (objektets metoder)
  public String getSuit() {
    return suit_;
  }

  public int getValue() {
    return value_;
  }

  public String getCardInformation() {
    String information = "Card information: " + suit_ + " " + value_;
    return information;
  }

  public String toString() {

    String output = "";
    output = suit_ + " ";

    switch(value_) {
      case 1: output += "Ace";
              break;
      case 11: output += "Jack";
              break;
      case 12: output += "Queen";
              break;
      case 13: output += "King";
              break;
      default: output += value_;
              break;
    }

    return output;
  }
}
