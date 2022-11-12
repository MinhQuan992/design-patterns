package org.example.singletonpattern;

public class ChocolateBoilerController {
  private static final long SLEEP_TIME = 2000;

  public static void main(String[] args) {
    ChocolateBoilerRunnable runnable0 = new ChocolateBoilerRunnable();
    Thread chocolateBoilerThread0 = new Thread(runnable0, "Thread 0");

    ChocolateBoilerRunnable runnable1 = new ChocolateBoilerRunnable();
    Thread chocolateBoilerThread1 = new Thread(runnable1, "Thread 1");

    chocolateBoilerThread0.start();

    chocolateBoilerThread1.start();
  }

  private static class ChocolateBoilerRunnable implements Runnable {
    @Override
    public void run() {
      String threadName = Thread.currentThread().getName();
      System.out.println(threadName + " starts");
      try {
        Thread.sleep(SLEEP_TIME);
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        Thread.sleep(SLEEP_TIME);
        chocolateBoiler.fill();
        Thread.sleep(SLEEP_TIME);
        chocolateBoiler.boil();
        Thread.sleep(SLEEP_TIME);
        chocolateBoiler.drain();
        Thread.sleep(SLEEP_TIME);
        System.out.println(threadName + " used " + chocolateBoiler);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }
}
