package liskov.bad;

public class Swan extends Bird {

    @Override
    public void eat() {
        System.out.println("I can eat rice.");
    }

    @Override
    public void fly() {
        System.out.println("I can fly.");
    }

}
