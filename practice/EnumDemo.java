public class Demo {
	public static void main(String[] args) {
		SimpleDateFormat formatA = new SimpleDateFormat(yyyy/MM/dd hh:mm:ss);
		Date setUpdate = null;

		try {
			setUpdate = formatA.parse("2014/01/01 13:22:09");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("Set up date: " + setUpdate);

		string formatDate = formatA.format(setUpdate);
		System.out.println("formatted date: ");
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
