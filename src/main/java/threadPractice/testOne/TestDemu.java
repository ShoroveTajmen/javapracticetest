package threadPractice.testOne;

public class TestDemu {
    public static void main(String[] args) {
        System.out.println("Hello: Thread name: "  +Thread.currentThread().getName());
        //MyThread myThread = new MyThread();
        //myThread.start();

        //for(int i = 0; i<10; i++){
            //System.out.println("Mainthread: " +i);
       // }

        Runnable runnable = new Myrunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
