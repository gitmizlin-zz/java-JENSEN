public enum CardColor {
	CLOVER('\u2663'),
	DIAMOND('\u2666'),
	SPADE('\u2660'),
	HEART('\u2665');

	public final char symbol;

	CardColor(char c) { // constructor
		symbol = c;
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
