public class Snake {

  public static long hiss = 2;

  public static void main(String[] args) {
    Snake snake = new Snake();
    System.out.println(hiss);
    snake = null;
    System.out.println(snake.hiss);
  }
}
