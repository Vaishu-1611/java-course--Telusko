class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ExceptionThreadDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception caught");
        }

        MyThread t1 = new MyThread();
        t1.start();
    }
}
