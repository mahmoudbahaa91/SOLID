package liskov.good;

public class Swan extends  FlyingBird{

    @Override
    public void eat() {
        System.out.println("I can eat something.");
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly!");
    }

}
