package threadPractice.testOne;

public class Myrunnable implements Runnable{
    @Override
    public  void run(){
        System.out.println("Thread name: "  +Thread.currentThread().getName());
        for(int i = 0; i<10; i++){
            System.out.println("From child thread runnable: " +i);
        }

    }
}
