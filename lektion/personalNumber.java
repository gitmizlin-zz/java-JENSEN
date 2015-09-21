/** Task: Check if the entered personal number is valid.

Conditions:
  1. A personal number is a 10-digit number.
  2. The first 8 digits represents a birth date (before today).
  3. Checksum: To calculate the checksum, multiply the individual
   digits in the identity number and 212121-212. The resulting 
   products (a two digit product, such as 16, would be converted 
   to 1 + 6) are added together. The checksum is the last digit of 
   10 minus the last digit in this sum (note that if the last 
   digit of the sum is zero, the checksum is 0).
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class personalNumber {
  public static boolean isValidLength(String str) {

    return str.length() == 10;
  }

  public static boolean isNumeric(String str) {

    try {
      double d = Double.parseDouble(str);  
    }
    catch (NumberFormatException nfe) {
      System.out.println(nfe.getMessage());
      System.out.println("Invalid: Not numeric.");
      return false;
    }

    return true;
  }

  public static Date parseDate(String inDate) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
    dateFormat.setLenient(false);
    inDate = inDate.substring(0, 6);

    return dateFormat.parse(inDate);
  }

  public static boolean isDateBeforeToday(Date date) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
    Date today = new Date();

    return (date.before(today));
  }

  public static boolean isValidControlNumber(char[] personalNumber) {
    int controlSum = 0;
    for (int i = 0; i < personalNumber.length - 1; i++) {
      int currentDigit = Character.getNumericValue(personalNumber[i]);

      if (i % 2 == 0) {
        currentDigit *= 2;
      }

      if (currentDigit > 9) {
        currentDigit = currentDigit - 9;
      } 

      controlSum += currentDigit;
    }

    controlSum = controlSum % 10;

    // System.out.println("Control sum: " + controlSum);
    // System.out.println("Control number: " + personalNumber[personalNumber.length - 1]);

    return controlSum + Character.getNumericValue(personalNumber[personalNumber.length - 1]) == 10;
  }

  public static void main(String[] args) {
    String inputNumber;
    Date date;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a personal number: ");
    inputNumber = keyboard.nextLine();

    if (!isValidLength(inputNumber) || !isNumeric(inputNumber)) {
      System.out.println("Invalid data: You must enter a 10-digit number.");
      return;
    }

    try {
      date = parseDate(inputNumber);
    } catch (ParseException pe) {
      System.out.println("Invalid birth date. Error: " + pe.getMessage());
      return;
    }

    if (!isDateBeforeToday(date)) {
      System.out.println("Invalid: The birth date is after today.");
      return;
    }

    if (!isValidControlNumber(inputNumber.toCharArray())) {
      System.out.println("Invalid: Control number does not match.");
      return;
    }
        
    System.out.println(inputNumber + " is a valid personal number.");
  }
}
