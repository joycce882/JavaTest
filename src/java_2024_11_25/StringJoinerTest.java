package java_2024_11_25;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        sj.add("Hello");
        sj.add("World!");
        String s = sj.toString();
        System.out.println(s);
    }
}
