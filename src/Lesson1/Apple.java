package Lesson1;


public class Apple extends Fruit {
    private float weightApple = 1.0f;


    public Apple() {
        super(1.0f);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weightApple=" + weightApple +
                '}';
    }
}
