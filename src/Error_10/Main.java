package Error_10;

import java.util.ArrayList;
import java.util.List;

/*次のコードでは、numbersリストの偶数の要素を合計する必要があります。
 * しかし、ラムダ式が正しく実装されていないため、エラーが発生しています。*/

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
}
/*問題3では、numbersリストの要素をストリームに変換し、
 * filter()メソッドを使用して偶数の要素を選択し、
 * reduce()メソッドを使用して合計値を計算しています。
 */