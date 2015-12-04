import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Test {
	
	SimpleDateFormat formatA = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	
	public static void main(String arg[]) {
		System.out.println("formatted set up date: " + formatDate(parseDate("2014/11/30 09:31:09")));
		
		public String formatDate(Date date) {
			String formattedDate;
			try {
				formattedDate = formatA.format(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return formattedDate;
		}
	
		public Date parseDate(String dateString) {
		Date setUpDate;
			try {
			// parse given date according to the format
		    	setUpDate = formatA.parse(dateString); // returns the set date in default date format
		    	System.out.println("parsed date: " + parseDate(text blabla));
			} catch (ParseException e) {
			    e.printStackTrace();
			}
			return setUpDate;
    	}
    }		
}



	
		
}


// public class EnumDemo {
// 		public enum Months {
// 			JANUARY,
// 			FEBRUARY,
// 			MARCH,
// 			APRIL,
// 			MAY,
// 			JUNE,
// 			JULY,
// 			AUGUST,
// 			SEPTEMBER,
// 			OCTOBER,
// 			NOVEMBER,
// 			DECEMBER
// 		}

// 	Months months;
// 		public getMonth() {
// 			switch months {
// 				case JANUARY: 
// 					return 1;
// 					break;
// 				case FEBRUARY: 
// 					return 2;
// 					break;
// 				case MARCH: 
// 					return 3;
// 					break;
// 				case APRIL: 
// 					return 4;
// 					break;
// 				case MAY:
// 					return 5;
// 					break;
// 				case JUNE:
// 					return 6;
// 					break;
// 				case JULY:
// 					return 7;
// 					break;
// 				case AUGUST:
// 					return 8;
// 					break;
// 				case SEPTEMBER:
// 					return 9;
// 					break;
// 				case OCTOBER:
// 					return 10;
// 					break;
// 				case NOVEMBER;
// 					return 11;
// 					break;
// 				case DECEMBER:
// 					return 12;
// 					break;	
// 				default: 	
// 					System.out.println("defaul!!");
// 					break;	
// 			}
// 		}
// 	}	
// }
