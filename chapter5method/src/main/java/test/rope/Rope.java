package test.rope;

public class Rope {
    public static int LENGTH = 5;
    public static int length = 0;

    static {
        LENGTH = 10;
    }

    public static void swing() {
        System.out.print("swing ");
    }
}
