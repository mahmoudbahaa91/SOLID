package liskov.bad;

public class Penguin extends Bird {

    @Override
    public void eat() {
        System.out.println("Can I eat taco?");
    }

    /**
     * this means that this subclass will not behave as same as the parent class.
     */
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Help! I cannot fly!");
    }

}
