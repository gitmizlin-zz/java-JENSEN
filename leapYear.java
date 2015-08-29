/** Check the input year is a leap year.

1. The year is evenly divisible by 4;
2. If the year can be evenly divided by 100, it is NOT a leap year, unless; The year is also evenly divisible by 400. Then it is a leap year. */

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {

        int year;        
        Scanner reader = new Scanner(System.in);

        String userInputYear;

        System.out.print("Enter a year: ");

        userInputYear = reader.next();
        year = Integer.parseInt(userInputYear);   
  
        if (year % 4 != 0) {
            System.out.println("Not leap year");

            return;
        }

        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Not leap year");

            return;
        }

        System.out.println("Leap year");
    }
}


        