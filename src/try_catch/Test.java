package try_catch;

import java.io.IOException;

public class Test {
    public void test1(String data) throws IOException {
        test2(data);
        System.out.println("finish run test2");
    }

    //throws and throw different is throws is use for throw to method that call first
    public void test2(String data) throws IOException {
        if (data == "err uncheck") {
            throw new IOException("error");
        } else if (data == "err check") {
            throw new RuntimeException();
        } else {
            System.out.println("pass");
        }
    }
}
