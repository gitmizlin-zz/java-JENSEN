import java.util.ArrayList;

public class Hand {

    public static int checkSameValues(ArrayList<Dice> diceList, int diceValue) {
        int tot =0;
        int i = 0;
        for (Dice dice : diceList) {
            if (dice.getValue() == diceValue) {
                tot = tot + diceValue;
                i++;
            }
        }
        return tot;
    }

    public static int checkOnePair(ArrayList<Dice> diceList) {
        int tot = 0;

        for (int i = 0; i < 4; i++) {
            int firstValue = diceList.get(i).getValue();
            int secondValue = diceList.get(i + 1).getValue();

            if (firstValue == secondValue) {
                tot = firstValue + secondValue;
            }
        }
        return tot;
    }

    public static int checkTwoPairs(ArrayList<Dice> diceList) {
        int tot = 0;

        for (int i = 0; i < 3; i++) {
            int firstValue = diceList.get(i).getValue();
            int secondValue = diceList.get(i + 1).getValue();

            if (firstValue == secondValue) {
                for (int k = i + 2; k < 4; k++) {
                    int thirdValue = diceList.get(k).getValue();
                    int fourthValue = diceList.get(k + 1).getValue();

                    if (secondValue != thirdValue && thirdValue == fourthValue) {
                        tot = firstValue + secondValue + thirdValue + fourthValue;
                    }
                }
            }
        }
        return tot;
    }

    public static int checkThreeOfAKind(ArrayList<Dice> diceList) {
        // source http://stackoverflow.com/questions/10359781/comparing-poker-hand-in-java
        int tot = 0;

        for (int i = 0; i < 3; i++) {
            int firstValue = diceList.get(i).getValue();
            int secondValue = diceList.get(i + 1).getValue();
            int thirdValue = diceList.get(i + 2).getValue();

            if (firstValue == secondValue && secondValue == thirdValue) {
                tot = firstValue + secondValue + thirdValue;
            }
        }
        return tot;
    }

    public static int checkFourOfAKind(ArrayList<Dice> diceList) {
        int tot = 0;

        for (int i = 0; i < 2; i++) {
            int firstValue = diceList.get(i).getValue();
            int secondValue = diceList.get(i + 1).getValue();
            int thirdValue = diceList.get(i + 2).getValue();
            int fourthValue = diceList.get(i + 3).getValue();

            if (i < 1) {
                int fifthValue = diceList.get(i + 4).getValue();

                if (firstValue == secondValue && secondValue == thirdValue && thirdValue == fourthValue && fourthValue != fifthValue) {
                    tot = firstValue + secondValue + thirdValue + fourthValue;
                }

            } else if (firstValue == secondValue && secondValue == thirdValue && thirdValue == fourthValue) {
                tot = firstValue + secondValue + thirdValue + fourthValue;
            }
        }
        return tot;
    }

    public static int checkFullHouse(ArrayList<Dice> diceList) {
        int i = 0;
        int tot = 0;
        int firstValue = diceList.get(i).getValue();
        int secondValue = diceList.get(i + 1).getValue();
        int thirdValue = diceList.get(i + 2).getValue();
        int fourthValue = diceList.get(i + 3).getValue();
        int fifthValue = diceList.get(i + 4).getValue();

        if (((firstValue == secondValue) && (secondValue== thirdValue) && (fourthValue == fifthValue) && (thirdValue != fourthValue)) ||
        ((firstValue == secondValue) && (secondValue != thirdValue) && (thirdValue == fourthValue) && (fourthValue == fifthValue))) {
            tot = firstValue + secondValue + thirdValue + fourthValue + fifthValue;
        }
        return tot;
    }

     public static int checkStraight(ArrayList<Dice> diceList, int largestNr) {
         int seqCnt = 0;
         int tot = 0;

         for(int i = 0; i < 4; i++) {
             int firstValue = diceList.get(i).getValue();
             int secondValue = diceList.get(i + 1).getValue();
             if (secondValue == firstValue + 1) {
                 seqCnt++;
             }
         }
         // Small straight
         if (diceList.get(diceList.size() - 1).getValue() == largestNr && seqCnt == 4) {
             if (largestNr == 5) {
                 tot = 15;
             } else if (largestNr == 6) {
                 tot = 20;
             }
         }
         return tot;
     }

    public static int checkChance(ArrayList<Dice> diceList) {
        int tot = 0;
        int i = 0;

        for(Dice dice : diceList) {
            int diceValue = dice.getValue();
            tot = tot + diceValue;
            i++;
        }
        return tot;
    }
    public static int checkYatzy(ArrayList<Dice> diceList) {
        int tot = 0;
        int counter = 0;

        for(int i = 0; i < 4; i++) {
            int firstValue = diceList.get(i).getValue();
            int secondValue = diceList.get(i + 1).getValue();
            if (firstValue == secondValue) {
                counter++;
            }
        }
        if (counter == 4) {
            tot = 50;
        }
        return tot;
    }

    public static int checkBonus(ArrayList<Dice> diceList) {
        int tot = 0;
        int bonus = 0;

        for (int i = 1; i <= 6; i++) {
            tot = tot + checkSameValues(diceList, i);
        }

        if (tot >= 63) {
            bonus = 50;
        }
        System.out.println("ones to sixes tot: " + tot);
        return bonus;
    }
}
