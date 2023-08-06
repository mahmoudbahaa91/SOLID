package dependencyinversion.good;

public class BackEndDeveloper implements Developer {

    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
        System.out.println("I'm writing Java...");
    }

}
