package generic;

public class Cup<T> {
    private T drink;

    public String getDrink() {
        return this.drink.getClass().getName();
    }

    public void setDrink(T drink) {
        this.drink = drink;
    }

    public T get() {
        return drink;
    }
}
