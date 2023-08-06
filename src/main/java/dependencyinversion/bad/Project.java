package dependencyinversion.bad;

public class Project {

    BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    public void implement(){
        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }

}
