package shore; // Same package as Bird

public class BirdWatcher {

    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // protected access is ok
        System.out.println(bird.text); // protected access is ok
    }

    public static void main(String[] args) {
        new BirdWatcher().watchBird();
    }
}
