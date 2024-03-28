package lab6.builder;

public class ConcreteBuilder implements Builder {
    private BuilderProduct builderProduct = new BuilderProduct();

    @Override
    public void buildPart1() {
        builderProduct.addPart("Часть 1");
    }

    @Override
    public void buildPart2() {
        builderProduct.addPart("Часть 2");
    }

    @Override
    public void buildPart3() {
        builderProduct.addPart("Часть 3");
    }

    public BuilderProduct getResult() {
        return builderProduct;
    }
}
