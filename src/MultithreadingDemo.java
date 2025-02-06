public class MultithreadingDemo {

  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      MultithreadThingExt multithreadThingExt = new MultithreadThingExt(i);
      multithreadThingExt.start();
    }

    for (int i = 0; i < 5; i++) {
      MultithreadThingImp multithreadThingImp = new MultithreadThingImp(i);
      Thread myThread = new Thread(multithreadThingImp);
      myThread.start();
      // program will stop executing the program and wait for this thread to die/complete
      try {
        myThread.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      // returns a boolean value based on whether the thread is still alive or not
      boolean isAlive = myThread.isAlive();
    }

  }

}
