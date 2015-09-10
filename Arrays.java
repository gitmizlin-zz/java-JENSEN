import java.util.Random;
import java.util.Scanner;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.PrintWriter;
import java.io.*;

public class Arrays {
   public static void main (String[] args) throws FileNotFoundException {

      int[] arr = new int[5];
      Random r = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter your first name: ");
      String firstName = keyboard.nextLine();
      
      System.out.print("Enter your last name: ");
      String lastName = keyboard.nextLine();

      System.out.print("Enter a file name: ");
      String fileName = keyboard.nextLine();
      
      System.out.println("Name (first last): " + firstName + " " + lastName);

      System.out.println("Here are your greades.");

      File f = null;
      f = new File(fileName);

      PrintWriter writer = new PrintWriter(fileName);
      writer.println(firstName + " " + lastName);

      for (int i = 0; i < arr.length; i++) {
         arr[i] = r.nextInt(100 - 1) + 1;

         writer.print(arr[i] + " ");
         
         System.out.println("Grade " + (i + 1) + ": " + arr[i]);
      }

      writer.close();

      System.out.println("Data saved in \"" + fileName + "\".");
     
   }

}

