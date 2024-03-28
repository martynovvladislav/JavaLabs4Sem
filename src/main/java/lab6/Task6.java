package lab6;

import lab6.abstractFactory.AbstractFactory;
import lab6.abstractFactory.ConcreteFactory;
import lab6.abstractFactory.ConcreteProductA;
import lab6.abstractFactory.ConcreteProductB;
import lab6.builder.Builder;
import lab6.builder.BuilderProduct;
import lab6.builder.ConcreteBuilder;
import lab6.builder.Director;
import lab6.factoryMethod.ConcreteCreator;
import lab6.factoryMethod.Creator;
import lab6.factoryMethod.Product;
import lab6.prototype.ConcretePrototype;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Factory method:");
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.create();

        System.out.println("\nAbstract Factory:");
        AbstractFactory factory = new ConcreteFactory();
        ConcreteProductA productA1 = factory.createProductA();
        ConcreteProductB productB1 = factory.createProductB();
        productA1.create();
        productB1.create();

        System.out.println("\nBuilder:");
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        BuilderProduct builderProduct = director.construct();
        builderProduct.showParts();

        System.out.println("\nPrototype:");
        ConcretePrototype prototype = new ConcretePrototype("Исходные данные");
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();
        System.out.println("Оригинал: " + prototype.getData());
        System.out.println("Копия: " + clone.getData());
    }
}
