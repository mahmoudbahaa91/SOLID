package liskov.good;


public class Penguin extends Bird {

    @Override
    public void eat() {
        System.out.println("Can I eat taco?");
    }

}
