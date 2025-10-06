public class RunnableDemo270 implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new RunnableDemo270());
        t.start();
    }
}