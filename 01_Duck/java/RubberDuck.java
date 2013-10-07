public class RubberDuck extends Duck {
  public RubberDuck() {
    quackBehavior = new Quack();
    //flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("저는 고무오리입니다");
  }
}
