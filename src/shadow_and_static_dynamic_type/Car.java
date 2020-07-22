package shadow_and_static_dynamic_type;

public class Car extends Vehicle {
    private final double version = 2.0;

    @Override
    public double getVersion() {
        return version;
    }

    @Override
    public String getName() {
        return "Car";
    }

    public String drive() {
        return "Drive";
    }
}
