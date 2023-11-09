import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Accumulate {

    static <T> List<T> accumulate(List<T> collection, Function<T, T> function) {
        // your code here
    }
}


class Main {

    public static void main(String[] args) {
        // Test 1: Squaring integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squared = Accumulate.accumulate(numbers, x -> x * x);
        System.out.println("Squaring integers: " + squared);

        // Test 2: Converting strings to uppercase
        List<String> words = Arrays.asList("hello", "world");
        List<String> uppercasedWords = Accumulate.accumulate(words, String::toUpperCase);
        System.out.println("Uppercase words: " + uppercasedWords);

        // Test 3: Reversing strings
        List<String> strings = Arrays.asList("abc", "def", "ghi");
        List<String> reversedStrings = Accumulate.accumulate(strings, s -> new StringBuilder(s).reverse().toString());
        System.out.println("Reversed strings: " + reversedStrings);
    }
}
