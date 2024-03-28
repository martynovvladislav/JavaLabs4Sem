package lab8;

import lab8.templateMethod.Algorithm;
import lab8.templateMethod.ConcreteAlgorithm;
import lab8.visitor.*;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Паттерн шаблонный метод:\n");
        Algorithm algorithm = new ConcreteAlgorithm();
        algorithm.execute();

        System.out.println("\nПаттерн посетитель:\n");
        Element elementA = new ElementA();
        Element elementB = new ElementB();

        Visitor visitor = new ConcreteVisitor();

        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}
