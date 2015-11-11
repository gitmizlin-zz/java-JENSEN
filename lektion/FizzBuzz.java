/** FizzBuzz
Gör ett skript som skriver ut talen 1 till 100.
För varje tal delbart med 3 skriv ut ”Fizz”.
För varje tal delbart med 5 skriv ut ”Buzz”.
För varje heltal delbart med både 3 och 5 skriv ut ”FizzBuzz”.
*/

import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else {
        if (i % 3 == 0) {
          System.out.println("Fizz");
        }
        if (i % 5 == 0) {
          System.out.println("Buzz");
        }
      }
      System.out.println(i);
    }
  }
}
