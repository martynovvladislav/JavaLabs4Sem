package lab1;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        String[] strings = {"abc", "aaaaaaaaaaaaa", "abcd", "aabbccddeeffgg", "abcdefrtyuikolp"};
        Arrays.stream(strings).forEach(System.out::println);
        Consumer<String> uniqueStringFinder = new UniqueStringFinder();
        System.out.println("\nUnique String:");
        uniqueStringFinder.accept(strings);
    }
}
