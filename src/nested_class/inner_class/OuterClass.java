package nested_class.inner_class;

public class OuterClass {
    private String sayHi = "Hello";
    private String name;

    public String getName() {
        return this.name;
    }

    public class InnerClass {
        public void sayHello() {
            System.out.println(sayHi);
        }

        public void sayName() {
            System.out.println(getName());
        }
    }
}
