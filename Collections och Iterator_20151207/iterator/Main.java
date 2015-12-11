import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    // Exempel på ett Set
        // Ett fotbollslag

        String nr1 = "Isaksson";
        String nr10 = "Larsson";
        String nr20 = "Svensson";
        String nr21 = "Ibrahimovic";

        HashSet<String> soccerPlayers = new HashSet<>();
        soccerPlayers.add(nr1);
        soccerPlayers.add(nr10);
        soccerPlayers.add(nr20);
        soccerPlayers.add(nr21);

        // Undersöker med metoden equals om objektet finns med
        System.out.println("Finns Isaksson med? " + soccerPlayers.contains("Isaksson"));
        System.out.println("Hur många spelare? " + soccerPlayers.size());

        soccerPlayers.add(nr21);
        System.out.println("Hur många spelare nu? " + soccerPlayers.size());

        soccerPlayers.add("isaksson");
        System.out.println("Hur många spelare nu? " + soccerPlayers.size());

        // Med en List
        ArrayList<String> footballPlayers = new ArrayList<>(22);
        footballPlayers.add(0, nr1);
       /* footballPlayers.add(8, nr10);
        footballPlayers.add(20, nr20);
        footballPlayers.add(21, nr21);*/

        System.out.println("(List) Hur många fotbollsspelare? " + footballPlayers.size());

        // Exempel med Map
        HashMap<Integer, String> teamSweden = new HashMap<>();
        teamSweden.put(1, nr1);
        teamSweden.put(10, nr10);
        teamSweden.put(20, nr20);
        teamSweden.put(21, nr21);

        System.out.println("Spelare #21: " + teamSweden.get(21));




    }
}
