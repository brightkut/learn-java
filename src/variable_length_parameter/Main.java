package variable_length_parameter;

public class Main {
    public static void main(String[] args) {
        printDetail("Bob", 1);
        printDetail("hello", 1, 2, 3, 4, 5);
    }

    //variable length is mean , you can add any amount of parameter with dynamic depends on input
    // need to put its in the end of line
    // can have only variable length
    public static void printDetail(String name, int... nums) {
        System.out.println(name);
        System.out.println(nums);
    }
}
