public class AutoboxingUnboxing {

    public static void main(String[] args) {

        int quack = 8;
        Integer quackquack = quack;
        int quackquackquack = quackquack;

        System.out.println(quackquackquack);

        // Long tryAutobox = 8; DOES NOT COMPILE because autobox with dif
        long primitiveTypeCompatible = 9;
        Integer intWrapper = 9;

        Integer integer = 2;
        // Long longerWrapper = integer; NO COMPILE with objects just w/ primitives

        Character charWrapper = null;
        char charWrapperChar = charWrapper; // NPE

        var c = new Chimpanzee();
        c.climb(1);
        c.swing(123);
        //  c.jump(123L); DOES NOT COMPILE - UNBOXING long in integer

        var gorilla = new Gorilla();
        //  gorilla.rest(1);  DOES NOT COMPILE - AUTOBOXING int to Long object no possible
    }

    static class Chimpanzee {
        public void climb(long t) {}

        public void swing(Integer u) {}

        public void jump(int v) {}
    }

    static class Gorilla {
        public void rest(Long x) {
            System.out.println(x);
        }
    }
}
