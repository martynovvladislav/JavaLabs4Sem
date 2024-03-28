package lab6.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderProduct {
    private List<String> parts = new ArrayList<>();

    public void addPart(String part) {
        parts.add(part);
    }

    public void showParts() {
        System.out.println("Продукт содержит части: " + parts);
    }
}
