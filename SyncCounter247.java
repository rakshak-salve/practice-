public class SyncCounter247 implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new SyncCounter247());
        t.start();
    }
}