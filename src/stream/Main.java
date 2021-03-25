package stream;

import java.util.StringJoiner;
import java.util.Vector;

public class Main {
    private StringJoiner stringJoiner = new StringJoiner(" ");

    public static void main(String[] args) {
        Vector<String> data = new Vector<>();
        data.add("apple");
        data.add("banana");
        data.add("rose apple");
        data.add("apple");
        data.add("straw berry");
        System.out.println(data);

        String[] res = data.stream().filter((element) -> element.equals("apple")).toArray(String[]::new);
        for (String s : res) {
            System.out.println(s);
        }
        System.out.println(data);
        Main m = new Main();
        m.testStringJoiner();
        m.testStringJoiner2();


    }

    public void testStringJoiner() {
        stringJoiner.add("a");
        stringJoiner.add("b");
        System.out.println(stringJoiner.toString());
    }

    public void testStringJoiner2() {
        stringJoiner.add("c");
        stringJoiner.add("d");
        System.out.println(stringJoiner.toString());
    }
}
