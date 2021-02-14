package threadPractice.testOne;

public class RunnableExampleAnonymousClass {
    public static void main(String[] args){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread name: "  +Thread.currentThread().getName());
                for(int i = 0; i<10; i++) {
                    System.out.println("From child thread runnable: " + i);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
