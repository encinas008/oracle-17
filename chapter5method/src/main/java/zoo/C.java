package zoo;

import static zoo.A.TYPE;

// import static zoo.B.TYPE;   DOES NOT COMPILE, TYPE is already defined in the first import.

public class C {

    public static void print() {
        System.out.println(TYPE);
    }
}
