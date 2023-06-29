package Error_9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
 * 次のコードでは、stringsリストの要素を大文字に変換した新しいリストを
 * 作成する必要があります。しかし、ラムダ式が正しく実装されていないため、
 * エラーが発生しています。*/


public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("java");

        List<String> uppercaseStrings = strings.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(uppercaseStrings);
    }
}
