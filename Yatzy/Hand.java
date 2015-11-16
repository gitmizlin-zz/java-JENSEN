import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand {
    Hand ones, twos, threes, fours, fives, sixes;

    public int checkOnes(ArrayList<Die> dice) {
        int i = 0;
        for (Die die : dice) {
            if (die.getFaceUp() == 1) {
                i++;
            }
        }

        return i;
    }

    public int checkTwos(ArrayList<Die> dice) {
        int i = 0;
        for (Die die : dice) {
            if (die.getFaceUp() == 2) {
                i += 2;
            }
        }

        return i;
    }

    public int checkThrees(ArrayList<Die> dice) {
        int i = 0;
        for (Die die : dice) {
            if (die.getFaceUp() == 3) {
                i += 3;
            }
        }

        return i;
    }

    public int checkFours(ArrayList<Die> dice) {
        int i = 0;
        for (Die die : dice) {
            if (die.getFaceUp() == 4) {
                i += 4;
            }
        }

        return i;
    }

    public int checkFives(ArrayList<Die> dice) {
        int i = 0;
        for (Die die : dice) {
            if (die.getFaceUp() == 5) {
                i += 5;
            }
        }

        return i;
    }

    public int checkSixes(ArrayList<Die> dice) {
        int i = 0;
        for (Die die : dice) {
            if (die.getFaceUp() == 6) {
                i += 6;
            }
        }

        return i;
    }

    ArrayList <Integer> onesList = new ArrayList<Integer>();
    ArrayList <Integer> twosList = new ArrayList<Integer>();
    ArrayList <Integer> threesList = new ArrayList<Integer>();
    ArrayList <Integer> foursList = new ArrayList<Integer>();
    ArrayList <Integer> fivesList = new ArrayList<Integer>();
    ArrayList <Integer> sixesList = new ArrayList<Integer>();

    public int checkThreeOfAKind(ArrayList<Die> dice) {
        for (Die die : dice) {
            switch (die.getFaceUp()){
                case 1:
                    onesList.add(1);
                    break;
                case 2:
                    twosList.add(2);
                    break;
                case 3:
                    threesList.add(3);
                    break;
                case 4:
                    foursList.add(4);
                    break;
                case 5:
                    fivesList.add(5);
                    break;
                case 6:
                    sixesList.add(6);
                    break;
            }
        }
        System.out.println(fivesList);
        int i = 0;

        if (sixesList.size() == 3) {
            i = 6 * 3;
            sixesList.clear();
            System.out.println(sixesList);

        } else if (fivesList.size() == 3) {
            i = 5 * 3;
            fivesList.clear();

        } else if (foursList.size() == 3) {
            i = 4 * 3;
            foursList.clear();

        } else if (threesList.size() == 3) {
            i = 3 * 3;
            threesList.clear();

        } else if (twosList.size() == 3) {
            i = 2 * 3;
            twosList.clear();

        } else if (onesList.size() == 3) {
            i = 1 * 3;
            onesList.clear();
        }

        System.out.println(fivesList);
        dice = null;
        return i;
    }
}
