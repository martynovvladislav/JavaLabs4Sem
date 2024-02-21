package lab1;

public class Task {
    public static void main(String[] args) {
        String[] strings = {"abc", "aaaaaaaaaaaaa", "abcd", "aabbccddeeffgg", "abcdefrtyuikolp"};
        Consumer<String> uniqueStringFinder = new UniqueStringFinder();
        uniqueStringFinder.accept(strings);
    }
}
