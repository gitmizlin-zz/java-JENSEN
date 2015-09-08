import java.util.Scanner;

public class WeekdayCalculator {

	public static void main (String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");

		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		System.out.println("You were born on " + weekday(mm, dd, yyyy));
	}

	public static String weekday (int mm, int dd, int yyyy) {
		int yy = yyyy - 1900;
		int total = yy / 4 + yy + dd;
		String date = "";
		total =+ monthOffset(mm);

		if (isLeap(yyyy) && (mm == 1 || mm == 2)) {
			total -= 1;
		}

		date = weekdayName(total % 7) + ", " + monthName(mm) + " " + dd + ", " + yyyy;

		return date;
	}

	public static int monthOffset(int month) {
		int result;

		switch(month) {
			case  1:
			case 10: result = 1;
					 break;
			case  2:
			case  3:
			case 11: result = 4;
					 break;
			case  4:
			case  7: result = 0;
					 break;
			case  5: result = 2;
					 break;
			case  6: result = 5;
					 break;
			case  8: result = 3;
					 break;
			case  9:
			case 12: result = 6;
					 break;
			default: result = -1;
		}
		return result;
	}

	public static boolean isLeap (int year) {
		boolean result;
		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		return result;
	}

	public static String weekdayName (int weekday) {
		String result = "";

		switch (weekday) {
			case 0: result = "Saturday";
			case 1: result = "Sunday";
			case 2: result = "Monday";
			case 3: result = "Tuesday";
			case 4: result = "Wednesday";
			case 5: result = "Thursday";
			case 6: result = "Friday";


		}
		return result;
	}

	public static String monthName (int month) {
		switch (month) {
			case 1: return "January";
			case 2: return "February";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "Semtember";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
			default: return "month error";
		}
	}
}


