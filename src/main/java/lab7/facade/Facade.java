package lab7.facade;

public class Facade {
    private SubSystemA subsystemA;
    private SubSystemB subsystemB;

    public Facade() {
        this.subsystemA = new SubSystemA();
        this.subsystemB = new SubSystemB();
    }

    public void operation() {
        System.out.println("Facade operation:\n");
        subsystemA.operation();
        subsystemB.operation();
    }
}
