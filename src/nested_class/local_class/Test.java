package nested_class.local_class;


public class Test {

    public void foo() {
        // Local class is a class that inside method of class and can use only within that method
        class LocalClass {
            public String name;

            public LocalClass(String n) {
                this.name = n;
            }

            public String getName() {
                return name;
            }
        }
        LocalClass local = new LocalClass("s");

        System.out.println(local.getName());
    }
}
