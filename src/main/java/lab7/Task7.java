package lab7;

import lab7.facade.Facade;
import lab7.linker.Component;
import lab7.linker.Composite;
import lab7.linker.Leaf;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Linker pattern:\n");
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");

        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);

        composite.operation();


        System.out.println("\nFacade pattern:\n");
        Facade facade = new Facade();
        facade.operation();
    }
}
