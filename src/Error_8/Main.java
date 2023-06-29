package Error_8;

import java.util.ArrayList;
import java.util.List;

/*次のコードでは、numbersリストの要素を2倍にして新しいリストを作成する
 * 必要があります。ただし、ラムダ式が正しく実装されていないため、
 * エラーが発生しています。*/

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<Integer> doubledNumbers = numbers.map(n -> n * 2); // ラムダ式が正しく実装されていません

        System.out.println(doubledNumbers);
    }
}
