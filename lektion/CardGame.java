public class CardGame {
  public static void main(String[] args) {
    System.out.println("Welcome to Card Game!");

    // Vad är en kortlek?

    // 52 st kort (spelkort)
    // (+ 2 st jokers)

    /*
      Färg / Klädsel / Suit
    */

    // Fyra typer
    // En: Diamond / Hearts / Spade / Clubs
    // Sv: Ruter / Hjärter / Spader / Klöver
    // Korten är även röda eller svarta...
    // ...men denna information ges även av klädseln

    /*
      Valör / Value
    */
    // En: Ace / 2-10 / Jack (J) / Queen (Q) / King (K)
    // Sv: Ess / 2-10 / Knekt / Drottning / Kung /

    // Klädda kort = K / Q / J / (A)

    // Skapa nya kort (instances)
    PlayingCard card = new PlayingCard("Diamonds", 5);  // 1-10, 11=J, 12=Q, 13=K
    System.out.println("Created card: " + card.getSuit() + " " + card.getValue());

    PlayingCard card2 = new PlayingCard("Hearts", 1);
    System.out.println(card2.getCardInformation());

    PlayingCard card3 = new PlayingCard("Spades", 12);

    // Utskrift av kort

    System.out.println(card2.toString());
    System.out.println(card3);      // Skriver ut det som metoden toString returnerar

    // Utmaning: Lägg till en konstruktor så att man köra följande kod
    // PlayingCard card4 = new PlayingCard("Hearts", 'A');
    // PlayingCard card5 = new PlayingCard("Clubs", 'J');
    // PlayingCard card6 = new PlayingCard("Diamonds", 'Q');
    // PlayingCard card6 = new PlayingCard("Spades", 'K');


    // UTMANING
    // Skapa några kort och spara i en vektor (array)
    // Vilken datatyp ska vektorn tillåta..?

    // Vi har en array med (objekt av typen) PlayingCard, dvs våra element är (av typen) PlayingCard

    PlayingCard[] handOfCards = new PlayingCard[6]; // här är PlayingCard INTE en klass utan en datatyp.
    PlayingCard card5 = new PlayingCard("Clubs", 7);
    handOfCards[0] = card5;
    handOfCards[1] = new PlayingCard("Spade", 'A');
    handOfCards[2] = new PlayingCard("Clubs", 'Q');
    handOfCards[3] = new PlayingCard("Diamond", 3);
    handOfCards[4] = new PlayingCard("Hearts", 4);
    handOfCards[5] = new PlayingCard("Spade", 'K');

    System.out.println("This is my hand.");
    for (int i = 0; i < handOfCards.length; i++) {
      System.out.println("Index " + i + " : " + handOfCards[i]);
    }  

    // motsvarande for-each i andra programmeringsspråk
    // for each card (we call it theCard) ikn the array handOfCards, do ....
    // nackdel: vi saknar vår variable i
    // fördel: kortare kod, vi behöver inte skriva ut hur stor array är eller använda variabeln i

    for(PlayingCard theCard : handOfCards) {
      // theCard är en variabel som kommer motsvara varje objekt i vår array
      System.out.println("Card: " + theCard);
    } 

    // Om du inte har någon kustruktor, då kan du bara skapa objekt med...
    //PlayingCard card10 = new PlayingCard();

    // generera en hel kortlek, en array med 52 element
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    //ropa igenom suits
    for(String theSuit : suits) {
      // skapa 13 kort av färgen theSuit
      for(int i = 1; i <= 13; i++) {
        PlayingCard someCard = new PlayingCard(theSuit, i);
        System.out.println(someCard);
      }
    }
  }
}

class PlayingCard {

  // Klassvariabler
  private int numberOfCards;


  // Instansvariabler
  private String suit_;    // Diamonds / Hearts / Clubs / Spades
  private int value_;      // 1 - Ace, 2 - 10, 11 - Jack, 12 - Queen, 13 - King


  // Konstruktorer
  // Namn på parametrar ska vara korta, men fortfarande meningsfulla
  // För att undvika konflikt mellan parametern suit och instansvariabeln suit finns flera sätt:
  // 1) Döp om instansvariabeln till ett namn följt av understreck, t.ex: suit_
  // 2) Använd this.suit när du menar instansvariabeln och bara suit för parametern
  // 3) Döp om parametern till något kort, "s", men detta rekommenderas ej, namnet tappar mening då

  public PlayingCard(String suit, int value) { // konstruktor
    /*
    suit = suit;      // Funkar ej, vi vet ej vilken suit som avses
    value = value;
    */

    /*
    this.suit = suit;       // Tänk som om det står card.suit = suit
    this.value = value;
    */

    suit_ = suit;
    value_ = value;

    /*
    suit = s;
    value = v;
    */
  }

  // Konstruktor som körs när man kör PlayingCard = new PlayingCard("Hearts", 'Q');
  public PlayingCard(String suit, char value) { // konstruktor
    // UTMANING: Fyll i koden här så att...
    // När value = 'A' så blir value_ = 1
    // När value = 'J' så blir value_ = 11
    // o.s.v...

    suit_ = suit;

    switch(value) {
      case 'A': value_ =  1; break;
      case 'J': value_ = 11; break;
      case 'Q': value_ = 12; break;
      case 'K': value_ = 13; break;
      default: value_ = value;
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

  // toString = speciell metod för att representera ens objekt som en sträng
  // Exempel: Namnet på objektet, ID:t på objektet, nånting beskrivande för just det objektet
  // toString returnerar objektets "strängrepresentation", d.v.s. vad objektet motsvarar i ren text
  // Utan toString får vi utskrifter av typen PlayingCard@37fc7193 (var objektet finns i minnet)

  public String toString() { // metod

    // UTMANING
    // Skriv kod så att det i strängen som returneras står "Ace" istället för 1, "Jack" istället för 11 o.s.v...
    String output = "";
    output = suit_ + " ";
    switch(value_) {
      case 1: output += "Ace"; break;
      case 11: output += "Jack"; break;
      case 12: output += "Queen"; break;
      case 13: output += "King"; break;
      default: output += value_; break;
    }
    return output;
  }
}
