public class SyncCounter266 implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread finished");
        } catch(InterruptedException e) {}
    }
    public static void main(String[] args) {
        Thread t = new Thread(new SyncCounter266());
        t.start();
    }
}
// Revision block 6
