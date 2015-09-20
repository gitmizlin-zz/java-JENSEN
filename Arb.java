// filename: TicTacToe.java
//
// This program plays the game of Tic-Tac-Toe with the user.

import java.util.Scanner;

// bara en public klass per fil!

public class Arb {
  public static void main (String[] args) {
    System.out.println("Welcome");


    Player player1 = new Player();
    player1.name = "Oscar";
    player1.points = 2;

    Player player2 = new Player();
    player2.name = "Johan";
    player2.points = 5;

    System.out.println("Name of player1: " + player1.name);
    System.out.println("Name of player2: " + player2.name);

    player1.nrOfPlayers = 2;

    // Player player3 = new player();
    // Player player4 = new player();

    System.out.println(player1.getName());
  
  }
}

class Player {
  // klassvariabler (börjar med static). 
  // Något gemensamt och samma värde för alla objekt t ex ett fotbollslags namn / flagga för alla dess spelare (objekten)
  static String favoriteColor = "Red";
  static int nrOfPlayers = 0;

  // instance variabler (en static)
  String name;
  int points;

  // metod med samma namn som klassen = konstruktor
  public void player(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

}