package lab8.visitor;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "\"Операция элемента A\"";
    }
}
