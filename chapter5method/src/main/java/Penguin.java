// Designing static Methods and Variables
public class Penguin {

    String name;
    static String nameOfTallestPenguin;

    public static void main(String[] args) {
        var p1 = new Penguin();
        p1.name = "Lilly";
        nameOfTallestPenguin = "Lilly";
        var p2 = new Penguin();
        p2.name = "Willy";
        nameOfTallestPenguin = "Willya";

        System.out.println(p1.name); // Lilly
        System.out.println(nameOfTallestPenguin); // Willy
        System.out.println(p2.name); // Willy
        System.out.println(nameOfTallestPenguin); // Willy
    }
}
