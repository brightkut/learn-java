package stream;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> data = new Vector<>();
        data.add("apple");
        data.add("banana");
        data.add("rose apple");
        data.add("apple");
        data.add("straw berry");
        System.out.println(data);

        String[] res = data.stream().filter((element) -> element == "apple").toArray(String[]::new);
        for (String s : res) {
            System.out.println(s);
        }
        System.out.println(data);
    }
}
