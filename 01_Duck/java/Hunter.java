public class Hunter {
  QuackBehavior quackBehavior;

  public Hunter () {
    quackBehavior = new Quack();
    quackBehavior.quack();
  }
}
