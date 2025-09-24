public class MyThread258 implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread258());
        t.start();
    }
}