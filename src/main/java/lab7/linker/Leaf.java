package lab7.linker;

public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Operation of leaf: " + name + " ");
    }
}
