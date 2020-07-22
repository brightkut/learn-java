package nested_class.static_nest_class;

public class Auto {
    private static int displacement = 10;
    private String name;

    public String getName() {
        return this.name;
    }

    public static class Engine {
        public int getDisplacement() {
            return displacement;
        }
    }
}
