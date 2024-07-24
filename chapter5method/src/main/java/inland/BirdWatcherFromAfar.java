package inland; // Different package than Bird

import shore.Bird;

public class BirdWatcherFromAfar { // Not a subclass of Bird

    public void watchBird() {
        Bird bird = new Bird();
        //        bird.floatInWater();  DOES NOT COMPILE
        //        System.out.println(bird.text);  DOES NOT COMPILE
    }
}
