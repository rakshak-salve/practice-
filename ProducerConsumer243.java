public class ProducerConsumer243 implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new ProducerConsumer243());
        t.start();
    }
}