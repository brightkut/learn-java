package thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        Thread have 6 status
        1. New (create instance of thread)
        2. Runnable (thread is running or processing)
        3. Waiting (told thread to waiting for working, need to call thread for run again
           it wait forever until you told run)
        4.Time wait (told thread wait with timing and when finish it will auto start )
        5. Block (block process in temporary time , like a synchronized)
        6. Terminated (destroy process of thread)

        Java auto create Main thread first when you create your application

        You can create thread with 4 manner
        1. extends Thread
        2. implement Runnable
        3. use anonymous class
        4. lambda
        */

//        //3 manner
//        Thread t= new Thread(){
//            @Override
//            public void run(){
//
//            }
//        };
//
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
//        Thread th = new Thread(r);
//
//
//        //4 manner
//        Runnable runnable = () -> {
//
//        };
//
//        Thread thread = new Thread(runnable);

        Runnable runnable1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("runnable1: " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(runnable1);

        Runnable runnable2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("runnable2: " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2 = new Thread(runnable2);

        Runnable runnable3 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("runnable3: " + i);
                try {
                    //can use in other way too such as you would like to set timeout not only work with multi thread
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread3 = new Thread(runnable3);

        //method start is will run method run in thread
//        thread1.start();
//        thread2.start();
//        thread3.start();

        // can set priority of thread
        // 1 to 10 , or MIN_PRIORITY(1) NORM_PRIORITY(5) MAX_PRIORITY(10)
//        thread1.setPriority(10);
//        thread2.setPriority(Thread.NORM_PRIORITY);
//        thread3.setPriority(2);
//        System.out.println(thread1.getPriority());
//        System.out.println(thread2.getPriority());
//        System.out.println(thread3.getPriority());
//        thread1.start();
//        thread2.start();
//        thread3.start();

        /*
        join method
        use for let thread work with timing example you set join 2 it run this thread with 2 milli seconds
        and run other thread , if you not set thread will run until finish and will continue run another thread
        */
//        thread1.start();
//        thread1.join();
//        thread2.start();

        /*
        yield method
        use for set thread to stop  but not block it just go back for waiting (in before runnable status)
        */
//        thread1.start();
//        thread1.yield();
//        thread2.start();

        /*
        Synchronized
        make a thread block object from other thread until first thread finish with that object
         */
        Printer printer = new Printer();
        PrinterThread printerThread = new PrinterThread(printer, 'a', 100);
        PrinterThread printerThread2 = new PrinterThread(printer, '1', 100);
        //if you use without sync you will see concurrency
        //output 1. without sync 00112 it possible
        //       2. with sync 0-99 , 0-99 because it block
        printerThread.start();
        printerThread2.start();
    }
}
