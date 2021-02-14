package threadPractice.testOne;

public class MyThread extends Thread {
       @Override
      public void run(){
           System.out.println("Hello from : Thread name: "  +Thread.currentThread().getName());
           for(int i = 0; i<10; i++){
               System.out.println("mythread: " +i);
           }
       }
}
