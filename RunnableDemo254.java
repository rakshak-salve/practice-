public class RunnableDemo254 implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new RunnableDemo254());
        t.start();
    }
}