public class SyncCounter269 implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new SyncCounter269());
        t.start();
    }
}