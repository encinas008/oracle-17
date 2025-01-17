package swan;

import shore.Bird;

public class Swan extends Bird {

    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        //    other.floatInWater();             DOES NOT COMPILE
        //    System.out.println(other.text);   DOES NOT COMPILE
    }
}
