package observer;

public class GraphObserver {
  public void update(NumberGenerator generator) {
    System.out.print("GraphObserver:");
    int count = generator.getNumber();
    for (int i = 0; i < count; i += 1) {
      System.out.print("*");
    }
    System.out.println(" ");
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
    }
  }
}
