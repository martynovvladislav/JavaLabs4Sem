package lab8.templateMethod;

public abstract class Algorithm {
    public void execute() {
        stepOne();
        stepTwo();
        stepThree();
    }

    protected abstract void stepOne();

    protected abstract void stepTwo();

    protected abstract void stepThree();
}
