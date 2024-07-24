import static java.util.Arrays.asList; // static import of method

public class StaticImports {

    public static void main(String[] args) {

        var list = asList(1, 2, 3, 4, 5, 6, 7, 8); // No Arrays. prefix

        System.out.println(list);
    }
}
