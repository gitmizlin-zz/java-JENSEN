/**
 * Created by oscar on 2015-12-07.
 */
public class ChristmasDemo {
    public static void main(String[] args) {
        System.out.println("Christmas Demo!");

        Package pc = new Package("Datorchassi", 2000);

        Thing motherboard = new Thing("Gigabyte", 2000);
        Thing processor = new Thing("Intel i7", 4000);

        pc.add(motherboard);
        pc.add(processor);

        Thing boardGame = new Thing("bord game", 600);

        Package oscarsGift = new Package("Julklapp", 10);

        oscarsGift.add(new Thing("Monitor", 3000));

        oscarsGift.add(pc);

        oscarsGift.add(boardGame);


        //pc.add(oscarsGift);
        System.out.println("Value PC:n: " + pc.getValue());
        System.out.println("Value Oscars julklapp: " + oscarsGift.getValue());

       System.out.println(oscarsGift);
       System.out.println("========");


        for(Object o : oscarsGift) {
            Gift g = (Gift)o;
            System.out.println(g.getName());
        }

        System.out.println("========");
        System.out.println(oscarsGift);




    }
}
