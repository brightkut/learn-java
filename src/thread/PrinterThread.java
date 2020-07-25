package thread;

public class PrinterThread extends Thread {
    private Printer mPrinter;
    private char aChar;
    private int t;

    public PrinterThread(Printer p, Character c, int t) {
        this.mPrinter = p;
        this.aChar = c;
        this.t = t;
    }

    public void run() {
//        mPrinter.printWithoutSync(this.aChar, this.t);
        mPrinter.printWithSync(this.aChar, this.t);
    }
}
