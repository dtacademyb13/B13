package day29;

public class TestAnimals {

    public static void main(String[] args) {

        Snake snake = new Snake();

        System.out.println(snake.color);
        System.out.println(snake.weight);

        snake.move();
        snake.eat();
    }
}
