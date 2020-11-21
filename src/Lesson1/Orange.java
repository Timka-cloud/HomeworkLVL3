package Lesson1;

public class Orange extends Fruit {
    private float weightOrange = 1.5f;


    public Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weightOrange=" + weightOrange +
                '}';
    }
}
