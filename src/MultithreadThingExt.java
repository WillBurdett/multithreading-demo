
public class MultithreadThingExt extends Thread {

  private int threadNumber;

  public MultithreadThingExt(int threadNumber) {
    this.threadNumber = threadNumber;
  }

  @Override
  public void run(){
    for (int i = 1; i <= 5; i++) {
      System.out.println(i + " from thread number " + threadNumber);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
    }
  }

}
