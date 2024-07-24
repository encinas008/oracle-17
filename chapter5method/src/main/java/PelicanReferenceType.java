import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class PelicanReferenceType {

    public void fly(String s) {
        System.out.print("String");
    }

    public void fly(Object s) {
        System.out.print("Object");
    }

    public static void main(String[] args) {
        var pelican = new PelicanReferenceType();
        pelican.fly("test");
        System.out.print("-");
        pelican.fly(56);
        System.out.println();

        // REFERENCE Types example overloading method
        Parrot.print("abc");
        Parrot.print(Arrays.asList(3));
        Parrot.print(LocalDate.of(2019, Month.JULY, 4));
        System.out.println();

        // PRIMITIVES example overloading method
        Ostrich ostrich = new Ostrich();
        ostrich.fly(123);
        ostrich.fly(123L);
        System.out.println();

        // AUTOBOXING
        Kiwi kiwi = new Kiwi();
        kiwi.fly(123);

        Kiwi.walk(new int[] {123});

        // Java calls to specific the at the end VARARGS
        System.out.print(Glider.glide("a"));
        System.out.print(Glider.glide("a", "b"));
        System.out.print(Glider.glide("a", "b", "c"));
    }

    static class Parrot {

        public static void print(List<Integer> i) {
            System.out.print("I");
        }

        public static void print(CharSequence c) {
            System.out.print("C");
        }

        public static void print(Object o) {
            System.out.print("O");
        }
    }

    // PRIMITIVES
    static class Ostrich {
        public void fly(int i) {
            System.out.print("int");
        }

        public void fly(long l) {
            System.out.print("long");
        }
    }

    //    AUTOBOXING
    static class Kiwi {

        public void fly(int numMiles) {}

        public void fly(Integer numMiles) {}

        public static void walk(int[] numbers) {}

        public static void walk(Integer[] numbers) {} // AUTOBOXING doesn't work with array

        public static void walk2(int[] numbers) {}

        //  public static void walk2(int... numbers2) {} // method signature already exist
    }

    // Java calls the most specific method it can
    static class Glider {

        public static String glide(String s) {
            return "1";
        }

        public static String glide(String... s) {
            return "2";
        }

        public static String glide(Object o) {
            return "3";
        }

        public static String glide(String s, String t) {
            return "4";
        }
    }
}
