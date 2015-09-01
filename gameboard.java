/** Rita ut ett tre-i-rad-spelbräde (förbättra gärna!) Förtydligande: gör ett program som ritar ut ett spelbräde för tre-i-rad

  |  |  
--------
  |  | 
--------
  |  |

*/

public class gameboard {  
  public static void main(String[] args) {

    int sizeOfBoardSide = 3;
    int sizeOfSpace = 2;
    String space = " ";
    String separator = "|";


    for (int i = 0; i <= sizeOfBoardSide + 1; i++) {
      if (i % 2 != 0) {
        for (int n = 0; n <= Math.pow(sizeOfBoardSide, 2); n++) {
        System.out.print("-");
        }
      } else { 
          for (int n = 0; n <= Math.pow(sizeOfBoardSide, 2); n++) {
          System.out.print("M"); // fixa här!!!
        }
      }

      System.out.print("\n");
    }
  }
}

// 0 1 "2" 3 4 "5" 6 7