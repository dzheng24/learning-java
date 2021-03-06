public class EchoTestDrive {
  public static void main (String [] args) {
    Echo e1 = new Echo();
    Echo e2 = e1;
    int x = 0;
    while (x < 4) {
      System.out.println("x is at " + x);
      e1.hello();
      e1.count = e1.count + 1;
      System.out.println("e1 count is " + e1.count);
      if (x == 3) {
        e2.count = e2.count + 1;
      }
      if (x > 0) {
        System.out.println("before the condition: " + e2.count);
        e2.count = e2.count + e1.count;
      }
      x = x + 1;
      System.out.println("e2 count at the end of loop is " + e2.count);
    }
    System.out.println(e2.count);
  }
}

class Echo {
  int count = 0;
  void hello() {
    System.out.println("Helloooo... ");
  }
}