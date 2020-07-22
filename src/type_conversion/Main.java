package type_conversion;

public class Main {
    public static void main(String[] args) {
        /* Type conversion
        1. Implicit conversion small type to big type
         e.g short to int
        2. Explicit conversion  big type to small type (need to use cast obj)
         e.g int to short
        */

        int x = 30;
        short y = 10;
        System.out.println(getType(x));
        System.out.println(getType(y));

        //Implicit conversion change short to int
        int a = y;
        System.out.println(getType(a));

        //Explicit conversion change int to int
        short b = (short) (x);
        System.out.println(getType(b));
    }

    public static String getType(Object o) {
        return o.getClass().getName();
    }
}
