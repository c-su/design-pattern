import framework.*;
import idcard.*;

public class Main {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("テスト1");
    Product card2 = factory.create("テスト2");
    Product card3 = factory.create("テスト3");
    card1.use();
    card2.use();
    card3.use();
  }
}