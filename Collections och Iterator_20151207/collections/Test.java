import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

public class Test {
	public static void main (String[] args) {
		String nr01 = "isak";
		String nr04 = "a";
		String nr02 = "b";
		String nr30 = "c";
		String nr12 = "d";

		HashSet<String> strings = new HashSet<>();
		strings.add(nr01);
		strings.add(nr12);
		strings.add(nr04);
		strings.add(nr30);
		
		System.out.println("Finns isak? " + strings.contains("isak"));
		System.out.println("Hur många strängar? " + strings.size());
		
		strings.add(nr02);
		System.out.println("Hur många strängar nu? " + strings.size());
		System.out.println("Printa ut strings " + strings);

		HashMap<Integer, String> stringsAL = new HashMap<>();
		stringsAL.put(1, nr01);
		stringsAL.put(12, nr12);
		stringsAL.put(30, nr30);

		System.out.println("nr30: " + stringsAL.get(12));		
	}
}
