import humanFactory.Gender;

/**
 * Created by oscar on 2015-12-10.
 */
public abstract class Human {
    String name;
    boolean isMarried;
    byte age; // -128 -- 127
    Gender gender;

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /*
    Designmönster: Factory
    Begränsa och kontrollera vilka objekt som kan skapas och hur de skapas
    Objekt skapas och returenras med en statisk metod (i detta fall create())
    Vi har här en "HumanFactory"
     */
    public static Human create(String personNr) {
        // 900101-0123
        // 0123456789
        // Vi vill undersöka index 9 i personnumret
        char nr = personNr.charAt(9);
        int x = (int) nr;
        Human human;

        if(x % 2 == 0) {
            // Skapa en kvinna
            human = new Woman();
        } else {
            human = new Man();
        }

        return human;

    }



    public static void main(String[] args) {
        //HumanFactory.Human human = new HumanFactory.Human();

        // Om gender var av typen byte kunde vi göra...
        // human.setGender((byte) 0);
        // human.setGender(MALE);

        // Gender är nu av typen Gender (som är en enum)
        //human.setGender(Gender.MALE);

        // Kommer att skapa ett objekt av typen HumanFactory.Man
        Human someGuy = Human.create("820102-1234");
        System.out.println(someGuy);

        // Kommer att skapa ett objekt av typen HumanFactory.Woman
        Human someGirl = Human.create("920319-0123");
        System.out.println(someGirl);

        System.out.println("h: " + Gender.values()[1]); // fake index, returns FEMALE.
    }
}    


class Man extends Human {

    public Man() {
        gender = Gender.MALE;
    }

    public String toString() {
        return name + " (Man)";
    }

}

class Woman extends Human {

    public Woman() {
        gender = Gender.FEMALE;
    }

    public String toString() {
        return name + " (Kvinna)";
    }
}