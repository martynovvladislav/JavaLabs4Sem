package lab1;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T[] ts);
}
