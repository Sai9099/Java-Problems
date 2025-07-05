class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
        }
    }
}



0
public class ThreadJoin {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { 
            MyThread t = new MyThread();
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All threads have finished execution.");
    }
}

