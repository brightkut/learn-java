package thread;

public class Printer {
    public void printWithoutSync(char c, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printWithSync(char c, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //other way remove synchronized return
        // this is call sync block
//        synchronized (this){
//            for (int i = 0; i < times; i++) {
//                System.out.println(i);
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
