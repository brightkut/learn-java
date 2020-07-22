package lambda;

//this annotation mean in this interface can have only one abstract method
//and can have any default method
@FunctionalInterface
public interface Calculator {
    double add(double x, double y);
}
