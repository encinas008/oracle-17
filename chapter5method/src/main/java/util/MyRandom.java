package util;

public class MyRandom {

    private void privateAccess() {}

    void packageAccess() {}

    protected void protectedAccess() {}

    String hike8(int a) {
        if (1 < 2) return "orange";
        return "apple";
    }

    public void myLocalVariable() {

        final var number = 10;

        System.out.println(number);
    }

    public void myLocalVariable2() {

        final String name = "Harry the Hippo";
        String result = name.substring(0);

        // size won't be possible to add final as optional specifier.
        var size = 10;
        if (size > 100) {
            size++;
        }

        final boolean wet;
        wet = true;
    }

}
