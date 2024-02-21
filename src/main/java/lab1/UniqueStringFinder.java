package lab1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueStringFinder implements Consumer<String>{
    @Override
    public void accept(String[] strings) {
        int max = 0;
        String maxString = "";
        for (String s : strings) {
            Set<Character> uniqueSymbols = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                uniqueSymbols.add(s.charAt(i));
            }
            if (max < uniqueSymbols.size()) {
                max = uniqueSymbols.size();
                maxString = s;
            }
        }
        System.out.println(maxString);
    }
}
