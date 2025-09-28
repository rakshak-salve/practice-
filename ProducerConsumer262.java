public class ProducerConsumer262 implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new ProducerConsumer262());
        t.start();
    }
}