package lab6.factoryMethod;

public class ConcreteProduct implements Product {
    @Override
    public void create() {
        System.out.println("Product has been created");
    }
}
