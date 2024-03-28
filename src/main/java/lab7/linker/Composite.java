package lab7.linker;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    @Override
    public void operation() {
        System.out.println("Operation of composite:\n");
        for (Component component : children) {
            component.operation();
        }
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }
}
