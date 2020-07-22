package nested_class.inner_class;

public class Main {
    public static void main(String[] args) {
        //Inner class is same like a static nest class
        //You must to create outer class before use inner class
        //can access all method and attribute
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.sayHello();
        inner.sayName();
    }
}
