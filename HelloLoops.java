import java.util.Scanner;

public class HelloLoops {
    public static void main(String[] args) {
        Scanner keyboard;

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i += 1; // lika med i++
            // Thread.sleep(500); // avvakta i 500 ms
        }

        int n;

        for (n = 1; n <= 10; n++) {
            System.out.println("Talet: " + n);
        }
        System.out.println(n); // output: 101

        int k = 4;
        do {
            System.out.println("k = " + k);
            k++;

        } while (k <= 5);


        // Play a game several times
        String answer = "";
        keyboard = new Scanner(System.in);

        do {
            System.out.println("Do you want to play the game (Y/N)?");
            answer = keyboard.nextLine();
        } while (answer.equals("Y") || answer.equals("y"));

        System.out.println("Thanks for playing!");

        for (int m = 0; m <= 10; m++) {
            System.out.println("For loop " + m);

            if (m==5) {
                break;
            }
        }

        for (char x = 'A'; x <= 'C'; x++) {
            for (int y = 1; y <= 3; y++) {
                // System.out.print("" + x + y + " "); // with "", x + y becomes concatination.
                System.out.format("%s%d ", x, y);

                if (y == 2) {
                    break; // breaks out from the closest outer loop to "if"
                }
            }
            System.out.println("\n");
        }

        String str = "Going good! gggGGG";
        int length = str.length();
        int nrOfG = 0;

        for (int j = 0; j < length; j++) {
            char c = str.charAt(j);
            System.out.println("The letter in the sentence: " + c);

            if (!(c == 'g' || c == 'G')) {
                continue;
            }
            nrOfG++;
        }    
        System.out.println("The number of g is: " + nrOfG);
    }
}        