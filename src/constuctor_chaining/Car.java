package constuctor_chaining;

public class Car extends Vehicle {
    public Car() {
        System.out.println("car");
        System.out.println(this.getClass().getName());
    }
}
