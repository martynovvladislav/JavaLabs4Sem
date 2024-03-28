package lab6.abstractFactory;

public class ConcreteProductB implements Product {
    @Override
    public void create() {
        System.out.println("Создан конкретный продукт B");
    }
}
