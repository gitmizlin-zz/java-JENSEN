import java.util.Random;

public class RandomNumber {

   public static int getRandomInt(int min, int max) {
      Random rand = new Random();
      int generateInt = rand.nextInt((max - min) + 1) + min; 
      return generateInt;
   }

   public static void main(String[] args) {

      int randomNum1 = getRandomInt(0, 100);
      int randomNum2 = getRandomInt(0, 100);

   /* 
   compareTo
   If the Integer is equal to the argument then 0 is returned.
   If the Integer is less than the argument then -1 is returned.
   If the Integer is greater than the argument then 1 is returned. 
   */

      int comparison = randomNum1.compareTo(randomNum2);

      switch (comparison) {
         case -1: System.out.println(randomNum2 + " is larger than " + randomNum1); p2.point++; break;
         case  0: System.out.println("Draw"); break;
         case  1: System.out.println(randomNum1 + " is larger than " + randomNum2); p1.point++; break;
      }

      for (int i = 1; i <= 100; i++) {
         int var = getRandomInt(0, 100);
         System.out.println(var);
      }
   }
}