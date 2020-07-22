package interfaces;

public interface IChair extends IChairType {
    // can extend interface
    public int x = 2;

    //can use only in interface
    public static String walk() {
        return "walk";
    }

    public String getName();

    public abstract void sayChair();

    //can write a concrete method not abstract in interface with 2manner
    // use default
    // use static
    public default String echo() {
        System.out.println(walk());
        return "echo";
    }
}
