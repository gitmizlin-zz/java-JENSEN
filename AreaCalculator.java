
import java.util.Scanner;

public class AreaCalculator {

	private static double ask(Scanner keyboard, String prompt) {
		System.out.println(prompt);
		return keyboard.nextDouble();
	}

	public static void areaCircle (Scanner keyboard) {
		double radius = ask(keyboard, "Radius: ");
		double area = Math.pow(radius, 2) * Math.PI;
		System.out.print("Area: " + String.format("%.2f", area));
	}

	public static void areaRectangle (Scanner keyboard) {
		double length = ask(keyboard, "Length: ");
		double width = ask(keyboard, "Width: ");
		System.out.println("Area: " + length * width);
	}

	public static void areaSquare (Scanner keyboard) {
		double side = ask(keyboard, "Side: ");
		System.out.println("Area: " + Math.pow(side, 2));
	}

	public static void areaTriangle (Scanner keyboard) {
		double base = ask(keyboard, "Base: ");
		double height = ask(keyboard, "Height: ");
		System.out.println("Area: " + base * height / 2);
	}

	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Choose a shape to get its area: \n" +
            "1) circle\n" +
            "2) rectangle\n" +
            "3) square\n" +
            "4) triangle\n" +
            "5) quit");

		switch (keyboard.nextInt()) {
			case 1: areaCircle(keyboard); break;
			case 2: areaRectangle(keyboard); break;
			case 3: areaSquare(keyboard); break;
			case 4: areaTriangle(keyboard); break;
			case 5: return;
			default: System.out.println("Invalid number");
				main(new String[]{});
		}
	}
}
