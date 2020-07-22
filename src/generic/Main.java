package generic;

public class Main {
    public static void main(String[] args) {
        //type generic
        Coffee coffee = new Coffee();
        Cup<Coffee> coffeeCup = new Cup<>();
        coffeeCup.setDrink(coffee);
        System.out.println(coffeeCup.getDrink());
        System.out.println(coffeeCup.get());

        Tea tea = new Tea();
        Cup<Tea> teaCup = new Cup<>();
        teaCup.setDrink(tea);
        System.out.println(teaCup.getDrink());
        System.out.println(teaCup.get());
    }
}
