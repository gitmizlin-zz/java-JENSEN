import java.util.Scanner;

public class HelloSwitch {
    public static void main(String[] args) {

        int age;
        String name;    
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = keyboard.nextLine();

        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        System.out.println("You are " + age + " years old.");

        switch (age) {
            case 18: System.out.println("Grattis! Körkort!");
                System.out.println("Grattis! Alkohol!");
                break;

            case 20: System.out.println("Systemet!"); 
                break;

            case 50: System.out.println("Jubileum!");
                break;

            default: System.out.println("inget");
                break;
        }

        switch (name) {
            case "Oscar": System.out.println("Teacher");
                break;

            case "Daniel": System.out.println("Student");

            default: System.out.println("Cool name!");
        }

    }
}        