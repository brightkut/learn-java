package lambda;

public class Main {
    public static void main(String[] args) {
        // The pros of lambda
        // 1. you can use instead of anonymous class
        // e.g

        // not use lambda
        Calculator c = new Calculator() {
            @Override
            public double add(double x, double y) {
                return x + y;
            }
        };
        System.out.println(c.add(2, 3));

        //use lambda
        Calculator b = (x, y) -> {
            return x + y;
        };
        System.out.println(b.add(2, 3));

        //2. can use like a parameter that determine process
        // e.g you have method that input is 2 double and do something
        // you can write only 1 method and use lambda for determine different process
        Calculator c1 = (x, y) -> {
            return x * y;
        };
        Calculator c2 = (x, y) -> {
            return x / y;
        };
        double res = compute(c1, 2, 3);
        double res2 = compute(c2, 2, 3);
        System.out.println(res);
        System.out.println(res2);

        //you can use method reference instead of lambda in some case like this
        //not use method reference (with static method)
        Calculator c3 = (x, y) -> Numeric.add(x, y);
        System.out.println(c3.add(2, 3));

        //use method ref (with static method)
        Calculator c4 = Numeric::add;
        System.out.println(c4.add(2, 3));

        //not use method reference (without static method)
        Numeric numeric = new Numeric();
        Calculator c5 = (x, y) -> numeric.minus(x, y);
        System.out.println(c5.add(2, 3));

        //use method ref (without static method)
        Calculator c6 = numeric::minus;
        System.out.println(c6.add(2, 3));
    }

    public static double compute(Calculator c, double x, double y) {
        return c.add(x, y);
    }
}
