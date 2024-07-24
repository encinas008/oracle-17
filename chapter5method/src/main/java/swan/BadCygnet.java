package swan;

import duck.MotherDuck;

// Package access modifier
public class BadCygnet {

    public void makeNoise() {
        var duck = new MotherDuck();
//        duck.quack(); Does not compile
//        System.out.println(duck.noise); Does not compile
    }
}
