package nested_class.static_nest_class;

public class Main {
    public static void main(String[] args) {
        //inner class can use static method and static attr of outer class
        //you can create any inner class , its like a member of outer class
        //when you would like to use static nest class you need to create specific instance of inner class
        Auto.Engine engine = new Auto.Engine();
        int d = engine.getDisplacement();
    }
}
