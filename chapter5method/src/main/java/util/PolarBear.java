package util;

// Final in the instance class
public class PolarBear {
    final int age = 10;
    final int fishEaten;
    final String name;

    {
        fishEaten = 10;
    }

    public PolarBear(String name) {
        this.name = name;
    }
}

// Vargs
class VisitAttractions {

    public void walk1(int... steps){}
    public void walk2(int starts, int... steps){}

    // no compile because varargs should be the last argument
//    public void walk3(int... steps, int starts){}
    // no compile because varargs it is allow just one vararg
//    public void walk4(int... starts, int... steps){}

    public void callingWalk1() {

        int[] numbers = new int[] {1,2,3};

        walk1(numbers);
        walk1(1,2,3);
    }
}

// Vargs calling
class DogWalker {

    public static void walkDog(int start, int... steps) {
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        walkDog(1);
        walkDog(1,2);
        walkDog(1,2, 3);
        walkDog(1,new int[]{2, 3});
    }
}

// Applying Access Modifiers

