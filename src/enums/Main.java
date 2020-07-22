package enums;

public class Main {
    public static void main(String[] args) {
        Role role = Role.Admin;
        Role role2 = Role.Normal;
        System.out.println(role);
        System.out.println(role2);

        System.out.println(Color.Blue.getValue());
    }

    public enum Color {
        Red(1), Green(2), Blue(3);
        private final int value;

        private Color(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
