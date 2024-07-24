package test;

public class Test {

    static String value2 = "blue";
    String value3 = "yellow";

    {
        value2 = "red";
        value3 = "red";
    }

    public void print(byte x) {
        System.out.print("byte-");
    }

    public void print(int x) {
        System.out.print("int-");
    }

    public void print(float x) {
        System.out.print("float-");
    }

    public void print(Object x) {
        System.out.print("Object-");
    }

    public static void main(String[] args) {
        Test test = new Test();
        byte shortNumber = 127;

        test.print(shortNumber);
        test.print(true);
        test.print(6.789);
    }
}
