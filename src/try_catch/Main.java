package try_catch;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // finally will run every time after try and catch

        try {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(num);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }

        /* we have 2 type of error exception
           1. check exception  e.g IO ,Sql Exception
           2. uncheck exception (not necessary to have try catch in outside)
              e.g Runtime, Arithemetic , Null pointer Exception
        */

        Test t = new Test();
//        t.test1("aaa");
        t.test1("err check");
//        t.test1("err uncheck");
    }
}
