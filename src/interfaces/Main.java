package interfaces;

public class Main {
    public static void main(String[] args) {
        IChair i = new IChair() {
            @Override
            public String getName() {
                return "name";
            }

            @Override
            public void sayChair() {
                System.out.println("chair");
            }

            @Override
            public String getType() {
                return "type";
            }
        };
        System.out.println(i.echo());
        i.sayChair();
    }
}
