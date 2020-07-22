package primitive_wrapper_class;

public class Main {
    public static void main(String[] args) {
        Integer x = 10;

        String a = "hello";
        //sub string
        System.out.println(a.substring(0, a.length() - 1));

        String b = "    h l e l efak ad   ";
        //remove white space before and after word
        System.out.println(b);
        System.out.println(b.trim());

        String r = "bob and java and tomus";
        //replace string
        System.out.println(r.replaceFirst("and", "or"));
        System.out.println(r);
        System.out.println(r.replaceAll("and", "or"));
        System.out.println(r);
        // default is replace all
        System.out.println(r.replace("and", "or"));

        //join
        String[] s = {"07", "02", "2020"};
        System.out.println(String.join("-", s));

        // StringBuilder not return String back like a string wrapper class not waste memory
        // StringBuilder and StringBuffer is quick performance than String when manage with a lot of String
        // Difference StringBuilder and StringBuffer is,  StringBuffer is synchronize its work with multithreading

        //add  String initial to constructor
        StringBuilder data = new StringBuilder("hello bright");
        System.out.println(data.reverse());

        //convert to string
        System.out.println(data.toString());
    }
}
