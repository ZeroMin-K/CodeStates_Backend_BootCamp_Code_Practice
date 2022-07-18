package section1.javaEffective.chapterStream;

import java.util.stream.Stream;
import java.util.Arrays;

public class ComparatorExample {
    public static void main(String[] args) {
        Stream<String[]> stringArraysStream = Stream.of(
                new String[]{"hello", "world", "java"},
                new String[]{"code", "states"});
        stringArraysStream.flatMap(Arrays::stream).forEach(System.out::println);
    }
}
