package practice15_1;

public class CountRunnable implements Runnable {

  final int count;
  final String threadName;

  // Setup Constructor to initialize variables
  CountRunnable(int count, String threadName) {
    this.count = count;
    this.threadName = threadName;
  }

  public void run() {
    // Count with for loop
    for (int i = 0; i < count; i++) {
      System.out.println(threadName + ": " + i);
    }
  }
}
