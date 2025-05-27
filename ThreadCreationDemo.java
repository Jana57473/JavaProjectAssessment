class MessageThread extends Thread {
    private String message;

    public MessageThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " (" + i + ")");
            try {
                Thread.sleep(200); // Short pause to see interleaving
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) {
        MessageThread t1 = new MessageThread("Thread One");
        MessageThread t2 = new MessageThread("Thread Two");

        t1.start();
        t2.start();
    }
}
