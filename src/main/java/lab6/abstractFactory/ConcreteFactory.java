package lab6.abstractFactory;

public class ConcreteFactory implements AbstractFactory {
    @Override
    public ConcreteProductA createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public ConcreteProductB createProductB() {
        return new ConcreteProductB();
    }
}
