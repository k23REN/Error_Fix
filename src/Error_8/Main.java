package Error_8;

/*次のコードでは、numbersリストの要素を2倍にして新しいリストを作成する
 * 必要があります。ただし、ラムダ式が正しく実装されていないため、
 * エラーが発生しています。*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(doubledNumbers);
    }
}
/*問題1では、numbersリストの要素をストリームに変換し、
 * map()メソッドを使用して各要素を2倍に変換しています。*/