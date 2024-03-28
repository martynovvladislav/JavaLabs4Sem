package lab8.templateMethod;

public class ConcreteAlgorithm extends Algorithm {
    @Override
    protected void stepOne() {
        System.out.println("Шаг алгоритма №1");
    }

    @Override
    protected void stepTwo() {
        System.out.println("Шаг алгоритма №2");
    }

    @Override
    protected void stepThree() {
        System.out.println("Шаг алгоритма №3");
    }
}
