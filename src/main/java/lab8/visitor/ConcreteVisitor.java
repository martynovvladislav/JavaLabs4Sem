package lab8.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Element element) {
        if (element instanceof ElementA) {
            System.out.println("Посетитель выполняет операцию " + ((ElementA) element).operationA());
        } else if (element instanceof ElementB) {
            System.out.println("Посетитель выполняет операцию " + ((ElementB) element).operationB());
        }
    }
}