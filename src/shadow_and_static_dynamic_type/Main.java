package shadow_and_static_dynamic_type;

public class Main {
    public static void main(String[] args) {
        //shadow is mean in child class if have attr same name it will override by use child not use super
        // its will not called override in term of attr override use only method
        //Static type and Dynamic type e.g Vehicle v= new Car()
        // vehicle is static type , car is dynamic type
        // difference is static is told what name of method that you available to use
        // dynamic is told what type of object

        Vehicle v = new Vehicle();
        Car car = new Car();
        Vehicle c = new Car();
        System.out.println(v.getVersion());
        System.out.println(c.getVersion());
        System.out.println(c.getClass().getName());
        System.out.println(c.getName());
        System.out.println(car.getName());
        System.out.println(car.drive());
    }
}
