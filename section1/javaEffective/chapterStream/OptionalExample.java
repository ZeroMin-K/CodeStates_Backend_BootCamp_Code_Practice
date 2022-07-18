package section1.javaEffective.chapterStream;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList(
                "Ruby", "Python", "Java", "Go", "Kotlin");
        Optional<List<String>> listOptional = Optional.of(languages);

        int size = listOptional
                .map(List::size)
                .orElse(0);
        System.out.println(size);
    }
}
