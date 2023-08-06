package dependencyinversion.good;

public class FrontEndDeveloper implements Developer {

    @Override
    public void develop() {
        writeJavascript();
    }

    private void writeJavascript() {
        System.out.println("I'm writing Javascript...");
    }

}
