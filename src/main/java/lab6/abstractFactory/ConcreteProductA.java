package lab6.abstractFactory;

public class ConcreteProductA implements Product {
    @Override
    public void create() {
        System.out.println("Создан конкретный продукт A");
    }
}
