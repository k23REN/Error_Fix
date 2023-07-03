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
        numbers.add(8);


		//偶数の要素を合計を作成
		//①偶数の場合のみ取得する
		//②合計をする
        Integer sum = numbers.stream()
        		//偶数を抽出
        		.filter(n -> n % 2 == 0)
        		//合計する
        		.reduce(0, Integer::sum); // ラムダ式が正しく実装されていません

        System.out.println("Sum: " + sum);
    }
}
