public class PassingObjects {

    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.println(name);

        var name2 = new StringBuilder("Java");
        speak2(name2);
        System.out.println(name2);

        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1);
        System.out.println(original2);
    }

    private static void speak2(StringBuilder s) {  // variable s is a copy "pass-by-value"
        s.append(" ");
        s.append("Certification");
    }

    private static void speak(String name) {
        name = "Rafa";
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
