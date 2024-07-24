package duck;

// Access modifier PRIVATE
public class BadDuckling {

  public void makeNoise() {
    var duck = new FatherDuck();
    //    duck.quack();  Does not compile
    //    System.out.println(duck.noise); Does not compile
  }
}
