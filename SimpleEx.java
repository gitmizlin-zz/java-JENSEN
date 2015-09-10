import javax.swing.JFrame;


public class SimpleEx {

   private int a, b, c;

   public int Bicycle() {
      gear = 1;
      cadence = 10;
      speed = 0;
   }

   public int Bicycle(int a, int b, int c) {
      gear = a;
      cadence = b;
      speed = c;
   }

   public int getValue() {
      return a + b + c;
   }    

   public static void main (String[] args) {

      Bicycle myByke = new Bicycle(30, 43, 2);
      Bicycle yourByke = new Bicycle();

      System.out.println(myByke.getValue());
      System.out.println(yourByke.getValue());
      
      // JFrame frame = new JFrame("Empty window");
      // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      // frame.pack();
      // frame.setVisible(true);
      // String name = JOptionPane.showInputDialog("Name?");
      // String input = JOptionPane.showInputDialog("Age?");
      // int age = Integer.parseInt(input);

      // System.out.print("Hello, " + name);
      // System.out.println("you are " + age );

      // System.exit(0);

   }
}

