package duck;

// Access modifier PACKAGE
public class GoodDuckling {

    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack();                   // package access is OKAY
        System.out.println(duck.noise); // package access is OKAY
    }
}
